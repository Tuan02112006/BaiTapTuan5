// SachTieuThuyet.java
public class SachTieuThuyet extends Sach {
    private String theLoai;
    private String series;
    private boolean laSachSeries;

    public SachTieuThuyet(String tieuDe, String tacGia, int namXuatBan,
                          double giaCoBan, int soLuong, String viTri,
                          String theLoai, String series) {
        super(tieuDe, tacGia, namXuatBan, giaCoBan, soLuong, viTri);
        this.theLoai = theLoai;
        this.series = series;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    // Ghi đè phương thức tính giá bán
    @Override
    public double tinhGiaBan() {
        int soNamXuatBan = 2025 - super.getNamXuatBan();
        if (laSachSeries) {
            return super.getGiaCoBan() + 15000;
        } else {
            return super.getGiaCoBan();
        }
    }

    // Ghi đè kiểm tra tồn kho
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.soLuong >= soLuongToiThieu;
    }

    // Ghi đè cập nhật vị trí
    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("Đã chuyển sách \"" + tieuDe + "\" đến khu vực: " + viTriMoi);
    }

    // Ghi đè toString
    @Override
    public String toString() {
        return "Sách Tiểu Thuyết - " +
                super.toString() +
                ", Thể loại: " + theLoai +
                ", Series: " + series +
                ", Giá bán: " + tinhGiaBan();
    }
}
