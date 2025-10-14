import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<sach> danhSachSach = new ArrayList<>();

    // Thêm sách
    public void themSach(sach s) {
        danhSachSach.add(s);
    }

    // Xóa sách
    public boolean xoaSach(String maSach) {
        for (sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                danhSachSach.remove(s);
                return true;
            }
        }
        return false;
    }

    // Cập nhật giá sách
    public boolean capNhatGia(String maSach, double giaMoi) {
        for (sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.giaTien = giaMoi;
                return true;
            }
        }
        return false;
    }

    // Tìm kiếm
    public sach timKiem(String maSach) {
        for (sach s : danhSachSach) {
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
        for (sach s : danhSachSach) {
            System.out.println(s);
        }
    }
}
