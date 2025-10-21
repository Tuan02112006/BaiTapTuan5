public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tenSach, String tacGia, double giaTien, int namXuatBan,double giaCoban,
                         String monHoc, String capDo) {
        super(maSach, tenSach, tacGia, giaTien, namXuatBan,giaCoban);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Môn học: " + monHoc +
                ", Cấp độ: " + capDo+
                ", gia co ban " + tinhgiaban();
    }
    @Override
    public double tinhgiaban(){
         int SoNamXuatBan = 2025 - super.getNamXuatBan();
         return super.getGiaCoban() + (SoNamXuatBan * 5000);
    }
}
