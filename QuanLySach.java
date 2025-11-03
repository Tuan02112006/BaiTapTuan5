import java.util.ArrayList;
import java.util.List;

public class QuanLySach implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach sach = timKiemSach(maSach);
        if (sach != null) {
            danhSach.remove(sach);
            return true;
        }
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            for (Sach s : danhSach) {
                System.out.println(s);
            }
        }
    }
}
