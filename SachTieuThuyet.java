public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,double GiaCoBan,String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong,GiaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }
    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }
    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    @Override
    public String toString() {
        return super.toString() + ", Thể loại: " + theLoai +
                ", Series: " + (laSachSeries ? "Có" : "Không")+
                ", Giá Bán: " + TinhGiaBan();
    }
    @Override
    public double TinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }
}
