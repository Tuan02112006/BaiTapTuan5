// SachGiaoTrinh.java
public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String tieuDe, String tacGia, int namXuatBan,
                         double giaCoBan, int soLuong, String viTri,
                         String monHoc, String capDo) {
        super(tieuDe, tacGia, namXuatBan, giaCoBan, soLuong, viTri);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }


    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getCapDo() {
        return capDo;
    }

    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }


    @Override
    public double tinhGiaBan() {
        int soNamXuatBan = 2025 - super.getNamXuatBan();
        return super.getGiaCoBan() + (soNamXuatBan * 5000);
    }


    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.soLuong >= soLuongToiThieu;
    }


    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("Đã chuyển sách \"" + tieuDe + "\" đến khu vực: " + viTriMoi);
    }


    @Override
    public String toString() {
        return "Sách Giáo Trình - " +
                super.toString() +
                ", Môn học: " + monHoc +
                ", Cấp độ: " + capDo +
                ", Giá bán: " + tinhGiaBan();
    }
}
