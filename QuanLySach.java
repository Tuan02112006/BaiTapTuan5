import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    // Thêm sách
    public void themSach(Sach s) {
        danhSachSach.add(s);
    }

    // Xóa sách
    public boolean xoaSach(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                danhSachSach.remove(s);
                return true;
            }
        }
        return false;
    }

    // Cập nhật giá sách
    public boolean capNhatGia(String maSach, double giaMoi) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.giaTien = giaMoi;
                return true;
            }
        }
        return false;
    }

    // Tìm kiếm
    public Sach timKiem(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    // Hiển thị
    public void hienThi() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Sach s : danhSachSach) {
            System.out.println(s);
        }
    }
}
