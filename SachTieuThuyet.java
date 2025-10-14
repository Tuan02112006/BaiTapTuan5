public class SachTieuThuyet extends Sach{
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,
                          int soLuong, String theLoai, boolean laSachSeries){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
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
    public String toString(){
        return super.toString() +
                "Thể loại: "+ theLoai+ "\n" +
                "là sách series: "+ laSachSeries+ "\n";
    }
}