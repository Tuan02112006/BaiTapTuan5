public class SachGiaoTrinh extends Sach{
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                         double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getNamXuatBan();
        return getGiaCoBan() + (soNam * 5000);
    }

    @Override
    public String toString() {
        return "===== SÁCH GIÁO TRÌNH =====\n" +
                "Mã sách: " + getMaSach() + "\n" +
                "Tiêu đề: " + getTieuDe() + "\n" +
                "Tác giả: " + getTacGia() + "\n" +
                "Năm xuất bản: " + getNamXuatBan() + "\n" +
                "Số lượng: " + getSoLuong() + "\n" +
                "Giá cơ bản: " + getGiaCoBan() + " VNĐ\n" +
                "Môn học: " + monHoc + "\n" +
                "Cấp độ: " + capDo + "\n" +
                "Giá bán ước tính: " + tinhGiaBan() + " VNĐ\n" +
                "=============================";
    }
}
