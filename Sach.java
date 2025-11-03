public abstract class Sach implements IGiaBan, IKiemKe {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected double giaCoBan;
    protected int soLuong;
    protected String viTri;

    public Sach(String maSach, String tieuDe, String tacGia,int namXuatBan, double giaCoBan, int soLuong, String viTri) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.giaCoBan = giaCoBan;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }

    // Getter & Setter
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

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
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
    public String toString() {
        return "Mã sách: " + maSach + "\n" +
                "Tiêu đề: " + tieuDe + "\n" +
                "Tác giả: " + tacGia + "\n" +
                "Năm xuất bản: " + namXuatBan + "\n" +
                "Số lượng: " + soLuong + "\n"+
                "Giá cơ bản: "+ giaCoBan+ "\n"+
                "Vị Trí: "+ viTri+ "\n";
    }

    @Override
    public abstract double tinhGiaBan();

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu){
        return this.soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi){
        this.setViTri(viTriMoi);
        System.out.println("Đã chuyển sách "+this.tieuDe+" đến khu vực : "+viTriMoi);
    }

}
