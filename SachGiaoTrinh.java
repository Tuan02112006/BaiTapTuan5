public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    // ===== Constructor =====
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,
                         int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    // ===== Getter / Setter =====
    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    // ===== Ghi đè phương thức tính giá bán =====
    @Override
    public double tinhGiaBan() {
        // Giá giáo trình = giá cơ bản + 10%
        return getGiaCoBan() * 1.1;
    }

    // ===== Hiển thị thông tin =====
    @Override
    public String toString() {
        return "📘 Sách giáo trình [" +
                "Mã: " + getMaSach() +
                ", Tên: " + getTieuDe() +
                ", Tác giả: " + getTacGia() +
                ", Năm XB: " + getNamXuatBan() +
                ", SL: " + getSoLuong() +
                ", Giá cơ bản: " + getGiaCoBan() +
                ", Môn học: " + monHoc +
                ", Cấp độ: " + capDo +
                "]";
    }
}
