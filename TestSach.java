public class TestSach {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Thêm sách thường
        Sach s1 = new Sach("S01", "Lập trình Java", "Nguyễn Văn A", 2023, 5);
        ql.themSach(s1);

        // Thêm sách giáo trình (lớp con)
        SachGiaoTrinh g1 = new SachGiaoTrinh("G01", "Toán rời rạc", "Trần Thị B", 2020, 10, "Toán", "Đại học");
        ql.themSach(g1);

        // Thêm sách tiểu thuyết (lớp con)
        SachTieuThuyet t1 = new SachTieuThuyet("T01", "Hoàng tử bé", "Saint-Exupéry", 1943, 7, "Truyện thiếu nhi", false);
        ql.themSach(t1);

        System.out.println("\n=== Danh sách sách hiện có ===");
        ql.hienThiDanhSach();

        System.out.println("\n=== Tìm sách có mã G01 ===");
        ql.timKiemVaIn("G01");

        System.out.println("\n=== Cập nhật số lượng sách S01 ===");
        ql.capNhatSoLuong("S01", 15);

        System.out.println("\n=== Xóa sách mã T01 ===");
        ql.xoaSach("T01");

        System.out.println("\n=== Danh sách sau khi xóa ===");
        ql.hienThiDanhSach();
    }
}
