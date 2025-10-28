
import java.util.ArrayList;
import java.util.List;

public class QuanLySach implements IQuanLySach {
    private List<Sach> danhSachSach;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
    }

    // Thêm sách
    @Override
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("Đã thêm sách: " + sach.getTieuDe());
    }

    // Tìm kiếm sách theo tiêu đề
    @Override
    public Sach timKiemSach(String tieuDe) {
        for (Sach s : danhSachSach) {
            if (s.getTieuDe().equalsIgnoreCase(tieuDe)) {
                return s;
            }
        }
        return null;
    }

    // Xóa sách theo tiêu đề
    @Override
    public boolean xoaSach(String tieuDe) {
        Sach sach = timKiemSach(tieuDe);
        if (sach != null) {
            danhSachSach.remove(sach);
            System.out.println("Đã xóa sách: " + tieuDe);
            return true;
        }
        System.out.println("Không tìm thấy sách có tiêu đề: " + tieuDe);
        return false;
    }

    // Hiển thị danh sách sách
    @Override
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách sách trống!");
            return;
        }
        System.out.println("===== DANH SÁCH SÁCH =====");
        for (Sach s : danhSachSach) {
            System.out.println(s);
        }
    }

    //  Lấy danh sách hiện tại (tuỳ chọn)
    @Override
    public List<Sach> getDanhSachSach() {
        return danhSachSach;
    }
}
