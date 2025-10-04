public class Sach {

    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach() {
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong);
    }

    public static void main(String[] args) {

        Sach s1 = new Sach("S01", "Lập trình Java", "Nguyễn Văn A", 2023, 5);
        s1.hienThiThongTin();
        Sach s2 = new Sach("S02", "Mưa đỏ", "Chu Lai", 1975, 5);
        s2.hienThiThongTin();
    }


}