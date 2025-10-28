import java.util.ArrayList;

public class QuanLySach implements IQuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
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
    public void xoaSach(String maSach) {
        danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    @Override
    public void hienThiDanhSach() {
        for (Sach s : danhSach) {
            System.out.println(s.toString());
            System.out.println("------------------------");
        }
    }
}