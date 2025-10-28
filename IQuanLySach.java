import java.util.List;

public interface IQuanLySach {
    void themSach(Sach s);
    boolean xoaSach(String maSach);
    boolean capNhatSoLuong(String maSach, int soLuongMoi);
    boolean capNhatGiaCoBan(String maSach, double giaMoi);
    void timKiemVaIn(String maSach);
    void hienThiDanhSach();
    int soLuongSach();
    List<Sach> getDanhSach();
}

