public abstract class  Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double GiaCoBan;

    public Sach() {}

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double TinhGiaBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.GiaCoBan = GiaCoBan;
    }

    // Getter / Setter
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

    public double getGiaCoBan() {
        return GiaCoBan;
    }
    public void setGiaCoBan(double giaCoBan) {
        this.GiaCoBan = giaCoBan;
    }

    @Override
    public String toString() {
        return "Mã: " + maSach +
                ", Tựa đề: " + tieuDe +
                ", Tác giả: " + tacGia +
                ", Năm: " + namXuatBan +
                ", SL: " + soLuong+
                ",Giá Cơ Bản: " + GiaCoBan;
    }
    public abstract double TinhGiaBan();

}
