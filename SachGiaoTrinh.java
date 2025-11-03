public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, double giaCoBan, int soLuong, String viTri, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, giaCoBan, soLuong, viTri);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public void setMonHoc(String monHoc){
        this.monHoc = monHoc;
    }

    public String getMonHoc(){
        return monHoc;
    }

    public void setCapDo(String capDo){
        this.capDo = capDo;
    }

    public String getCapDo(){
        return capDo;
    }

    // Ghi đè tính giá bán: Giá = giá cơ bản * 1.1
    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.1;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Môn học: " + monHoc + "\n" +
                "Cấp độ: " + capDo + "\n" +
                "Giá bán: "+ tinhGiaBan();
    }
}
