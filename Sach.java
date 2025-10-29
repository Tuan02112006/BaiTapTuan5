// Sach.java
public abstract class Sach implements IGiaBan, IKiemKe {


    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected double giaCoBan;
    protected int soLuong;
    protected String viTri;

    public Sach(String tieuDe, String tacGia, int namXuatBan, double giaCoBan, int soLuong, String viTri) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.giaCoBan = giaCoBan;
        this.soLuong = soLuong;
        this.viTri = viTri;
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

    public double getGiaCoBan() {
        return giaCoBan;
    }

    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }


    @Override
    public abstract double tinhGiaBan();

    @Override
    public abstract boolean kiemTraTonKho(int soLuongToiThieu);

    @Override
    public abstract void capNhatViTri(String viTriMoi);


    @Override
    public String toString() {
        return "Tiêu đề: " + tieuDe +
                ", Tác giả: " + tacGia +
                ", Năm XB: " + namXuatBan +
                ", Giá cơ bản: " + giaCoBan +
                ", Số lượng: " + soLuong +
                ", Vị trí: " + viTri;
    }
}
