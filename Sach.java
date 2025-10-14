public class Sach {
    protected String maSach;
    protected String tenSach;
    protected String tacGia;
    protected double giaTien;
    protected int namXuatBan;

    public Sach(String maSach, String tenSach, String tacGia, double giaTien, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.giaTien = giaTien;
        this.namXuatBan = namXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    @Override
    public String toString() {
        return "Mã sách: " + maSach +
                ", Tên sách: " + tenSach +
                ", Tác giả: " + tacGia +
                ", Giá: " + giaTien +
                ", Năm XB: " + namXuatBan;
    }
}
