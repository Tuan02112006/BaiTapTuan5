public abstract class Sach {
    protected String maSach;
    protected String tenSach;
    protected String tacGia;
    protected double giaTien;
    protected int namXuatBan;
    protected double giaCoban;

    public Sach(String maSach, String tenSach, String tacGia, double giaTien, int namXuatBan,double giaCoban) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.giaTien = giaTien;
        this.namXuatBan = namXuatBan;
        this.giaCoban = giaCoban;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach(){
           return tenSach;
    }

    public void setTenSach(String Tensach){
        this.tenSach = tenSach;
    }

    public String getTacGia(){
         return tacGia;
    }

    public void setTacGia(String tacGia){
        this.tacGia = tacGia;
    }

    public double getGiaTien(){
        return giaTien;
    }

    public void setGiaTien(double giaTien){
        this.giaTien = giaTien;
    }

    public int getNamXuatBan(){
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan){
        this.namXuatBan = namXuatBan;
    }

    public double getGiaCoban(){
        return giaCoban;
    }

    public void setGiaCoban(double giaCoban){
        this.giaCoban = giaCoban;
    };




    @Override
    public String toString() {
        return "Mã sách: " + maSach +
                ", Tên sách: " + tenSach +
                ", Tác giả: " + tacGia +
                ", Giá: " + giaTien +
                ", Năm XB: " + namXuatBan+
                ", gia cơ bản" + giaCoban;
    }

    public abstract double tinhgiaban();
}

