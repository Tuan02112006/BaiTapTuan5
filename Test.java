public class Test {
    public static void main(String[] args) {
        // Tạo sách bằng constructor đầy đủ
        Sach sach1 = new Sach("S001", "Lập trình Java cơ bản",
                "Nguyễn Văn A", 2023, 10);
        // Tạo sách bằng constructor mặc định + setter
        Sach sach2 = new Sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Cấu trúc dữ liệu & Giải thuật");
        sach2.setTacGia("Trần Văn B");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(5);
        sach1.hienThiThongTin();
        System.out.println("----------------------");
        sach2.hienThiThongTin();
    }
}
