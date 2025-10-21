public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,double GiaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, GiaCoBan);
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
    public String toString() {
        return super.toString() + ", Môn học: " + monHoc +
                ", Cấp độ: " + capDo+
                ", Giá Bán; " + TinhGiaBan();
    }
    @Override
    public double TinhGiaBan(){
        int sonam = 2025 - getSoLuong();
        return getGiaCoBan() + (sonam * 5000);
    }
}

