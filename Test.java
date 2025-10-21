public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // === Thêm sách giáo trình ===
        Sach g1 = new SachGiaoTrinh(
                "G01",
                "Toán rời rạc",
                "Trần Thị B",
                2020,
                10,
                120000,     // giá cơ bản
                "Toán",
                "Đại học"
        );
        ql.themSach(g1);

        Sach g2 = new SachGiaoTrinh(
                "G02",
                "Cấu trúc dữ liệu & Giải thuật",
                "Nguyễn Văn C",
                2018,
                7,
                150000,
                "CNTT",
                "Đại học"
        );
        ql.themSach(g2);

        // === Thêm sách tiểu thuyết ===
        Sach t1 = new SachTieuThuyet(
                "T01",
                "Hoàng tử bé",
                "Saint-Exupéry",
                1943,
                5,
                80000,
                "Thiếu nhi",
                false
        );
        ql.themSach(t1);

        Sach t2 = new SachTieuThuyet(
                "T02",
                "Harry Potter",
                "J.K. Rowling",
                2000,
                8,
                90000,
                "Phiêu lưu",
                true
        );
        ql.themSach(t2);

        // === Hiển thị danh sách ===
        System.out.println("\n=== DANH SÁCH SÁCH HIỆN CÓ ===");
        ql.hienThiDanhSach();

        // === Tìm sách ===
        System.out.println("\n=== TÌM SÁCH CÓ MÃ G02 ===");
        ql.timKiemVaIn("G02");

        // === Cập nhật số lượng ===
        System.out.println("\n=== CẬP NHẬT SỐ LƯỢNG SÁCH T01 ===");
        ql.capNhatSoLuong("T01", 12);

        // === Cập nhật giá cơ bản ===
        System.out.println("\n=== CẬP NHẬT GIÁ CƠ BẢN SÁCH G01 ===");
        ql.capNhatGiaCoBan("G01", 130000);

        // === Xóa sách ===
        System.out.println("\n=== XÓA SÁCH MÃ G02 ===");
        ql.xoaSach("G02");

        // === Hiển thị danh sách sau khi cập nhật ===
        System.out.println("\n=== DANH SÁCH SAU KHI CẬP NHẬT ===");
        ql.hienThiDanhSach();

        // === Thống kê tổng số sách ===
        System.out.println("\n Tổng số sách hiện có: " + ql.soLuongSach());
    }
}
