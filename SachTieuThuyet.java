public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia,int namXuatBan, double giaCoBan, int soLuong, String viTri, String theLoai, boolean laSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, giaCoBan, soLuong, viTri);
        this.theLoai = theLoai;
        this.laSeries = laSeries;
    }

    public void setTheLoai(String theLoai){
        this.theLoai = theLoai;
    }

    public String getTheLoai(){
        return theLoai;
    }

    public void setLaSeries(boolean laSeries){
        this.laSeries = laSeries;
    }

    public boolean getLaSeries(){
        return laSeries;
    }

    // Ghi đè tính giá bán: Giá = giá cơ bản * 1.2
    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Thể loại: " + theLoai + "\n" +
                "là sách series: " + laSeries + "\n"+
                "Giá bán: "+ tinhGiaBan();
    }
}
