public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tenSach, String tacGia, double giaTien, int namXuatBan,
                         String monHoc, String capDo) {
        super(maSach, tenSach, tacGia, giaTien, namXuatBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Môn học: " + monHoc +
                ", Cấp độ: " + capDo;
    }
}
