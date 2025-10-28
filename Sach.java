import java.util.Scanner;

public abstract class Sach implements IGiaBan, IKiemKe {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;

    public Sach() {
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaCoBan(){
        return giaCoBan;
    }
    public void setGiaCoBan(double giaCoBan){
        this.giaCoBan = giaCoBan;
    }

    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Giá cơ bản: "+ giaCoBan);
    }

    @Override
    public String toString() {
        return "Mã sách: " + maSach + "\n" +
                "Tiêu đề: " + tieuDe + "\n" +
                "Tác giả: " + tacGia + "\n" +
                "Năm xuất bản: " + namXuatBan + "\n" +
                "Số lượng: " + soLuong + "\n"+
                "Giá cơ bản: "+ giaCoBan+ "\n";
    }

    @Override
    public abstract double tinhGiaBan();

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu){
        return this.soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi){
        System.out.println("Đã chuyển sách "+this.tieuDe+" đến khu vực : "+viTriMoi);
    }
}

