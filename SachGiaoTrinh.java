public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, double giaCoBan,
                         int soLuong, String viTri, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, giaCoBan, soLuong, viTri);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    // Ghi đè tính giá bán: Giá = giá cơ bản * 1.1
    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.1;
    }

    // Kiểm kê tồn kho
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    // Cập nhật vị trí
    @Override
    public void capNhatViTri(String viTriMoi) {
        setViTri(viTriMoi);
        System.out.println("Đã chuyển sách \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }

    // Hiển thị thông tin
    @Override
    public String toString() {
        return "Sách Giáo Trình [" +
                "Mã: " + getMaSach() +
                ", Tiêu đề: " + getTieuDe() +
                ", Tác giả: " + getTacGia() +
                ", Môn học: " + monHoc +
                ", Cấp độ: " + capDo +
                ", Giá bán: " + String.format("%.2f", tinhGiaBan())+
                ", Tồn kho: " + getSoLuong() +
                ", Vị trí: " + getViTri() + "]";
    }
}
