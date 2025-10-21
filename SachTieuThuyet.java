public class SachTieuThuyet extends Sach{
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                          double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return "===== SÁCH TIỂU THUYẾT =====\n" +
                "Mã sách: " + getMaSach() + "\n" +
                "Tiêu đề: " + getTieuDe() + "\n" +
                "Tác giả: " + getTacGia() + "\n" +
                "Năm xuất bản: " + getNamXuatBan() + "\n" +
                "Số lượng: " + getSoLuong() + "\n" +
                "Giá cơ bản: " + getGiaCoBan() + " VNĐ\n" +
                "Thể loại: " + theLoai + "\n" +
                "Là sách series: " + (laSachSeries ? "Có" : "Không") + "\n" +
                "Giá bán ước tính: " + tinhGiaBan() + " VNĐ\n" +
                "=============================";
    }
}
