public class SachTieuThuyet extends Sach{
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,
                          int soLuong, double giaCoBan, String theLoai, boolean laSachSeries){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai =theLoai;
        this.laSachSeries =laSachSeries;
    }

    public String gettheLoai(){
        return theLoai;
    }
    public void settheLoai(String theLoai){
        this.theLoai = theLoai;
    }

    public boolean getLaSachSeries(){
        return laSachSeries;
    }
    public void setLaSachSeries(boolean laSachSeries){
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan(){
        if (laSachSeries)
            return getGiaCoBan()+ 15000;
        else
            return getGiaCoBan() ;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Thể loại: " + theLoai + "\n" +
                "là sách series: " + laSachSeries + "\n"+
                "Giá bán: "+ tinhGiaBan();
    }
}