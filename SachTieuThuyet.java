public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, double giaCoBan,
                          int soLuong, String viTri, String theLoai, boolean laSeries) {
        super(maSach, tieuDe, tacGia, giaCoBan, soLuong, viTri);
        this.theLoai = theLoai;
        this.laSeries = laSeries;
    }

    // Ghi đè tính giá bán: Giá = giá cơ bản * 1.2
    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.2;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        setViTri(viTriMoi);
        System.out.println("Đã chuyển sách \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "Sách Tiểu Thuyết [" +
                "Mã: " + getMaSach() +
                ", Tiêu đề: " + getTieuDe() +
                ", Tác giả: " + getTacGia() +
                ", Thể loại: " + theLoai +
                ", Series: " + (laSeries ? "Có" : "Không") +
                ", Giá bán: " + String.format("%.2f", tinhGiaBan()) +
                ", Tồn kho: " + getSoLuong() +
                ", Vị trí: " + getViTri() + "]";
    }
}
