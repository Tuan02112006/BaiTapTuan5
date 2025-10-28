import java.util.ArrayList;
import java.util.List;

public class QuanLySach implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
    }

    @Override
    public boolean xoaSach(String maSach) {
        return danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    @Override
    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setSoLuong(soLuongMoi);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean capNhatGiaCoBan(String maSach, double giaMoi) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setGiaCoBan(giaMoi);
                return true;
            }
        }
        return false;
    }

    @Override
    public void timKiemVaIn(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Không tìm thấy sách có mã: " + maSach);
    }

    @Override
    public void hienThiDanhSach() {
        for (Sach s : danhSach) {
            System.out.println(s);
        }
    }

    @Override
    public int soLuongSach() {
        return danhSach.size();
    }

    @Override
    public List<Sach> getDanhSach() {
        return danhSach;
    }
}
