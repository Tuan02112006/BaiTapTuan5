import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class QuanLySach {
    private final List<Sach> danhSach;

    public QuanLySach() {
        this.danhSach = new ArrayList<>();
    }

    // 🔹 Thêm sách (kiểm tra trùng mã)
    public void themSach(Sach s) {
        if (s == null) {
            System.out.println(" Không thể thêm sách null.");
            return;
        }
        if (timKiemObj(s.getMaSach()).isPresent()) {
            System.out.println("️ Mã sách đã tồn tại: " + s.getMaSach() + " — không thêm.");
            return;
        }
        danhSach.add(s);
        System.out.println(" Đã thêm sách: " + s.getMaSach());
    }

    // 🔹 Xóa sách theo mã
    public boolean xoaSach(String maSach) {
        boolean removed = danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
        if (removed)
            System.out.println(" Đã xóa sách có mã: " + maSach);
        else
            System.out.println(" Không tìm thấy sách có mã: " + maSach);
        return removed;
    }

    // 🔹 Cập nhật số lượng theo mã sách
    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        Optional<Sach> opt = timKiemObj(maSach);
        if (opt.isPresent()) {
            Sach s = opt.get();
            s.setSoLuong(soLuongMoi);
            System.out.println(" Cập nhật số lượng sách (mã=" + maSach + ") thành: " + soLuongMoi);
            return true;
        } else {
            System.out.println(" Không tìm thấy sách có mã: " + maSach);
            return false;
        }
    }

    // 🔹 Cập nhật giá cơ bản
    public boolean capNhatGiaCoBan(String maSach, double giaMoi) {
        Optional<Sach> opt = timKiemObj(maSach);
        if (opt.isPresent()) {
            Sach s = opt.get();
            s.setGiaCoBan(giaMoi);
            System.out.println(" Cập nhật giá cơ bản sách (mã=" + maSach + ") thành: " + giaMoi);
            return true;
        } else {
            System.out.println(" Không tìm thấy sách có mã: " + maSach);
            return false;
        }
    }

    // 🔹 Tìm kiếm đối tượng theo mã
    public Optional<Sach> timKiemObj(String maSach) {
        return danhSach.stream()
                .filter(s -> s.getMaSach().equalsIgnoreCase(maSach))
                .findFirst();
    }

    // 🔹 Tìm kiếm và in kết quả
    public void timKiemVaIn(String maSach) {
        timKiemObj(maSach).ifPresentOrElse(
                s -> {
                    System.out.println(" Tìm thấy sách:");
                    System.out.println(s);
                    System.out.println("  Giá bán: " + s.TinhGiaBan());
                },
                () -> System.out.println(" Không tìm thấy sách có mã: " + maSach)
        );
    }

    // 🔹 Hiển thị danh sách tất cả sách
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println(" Danh sách rỗng.");
            return;
        }
        System.out.println("===== DANH SÁCH SÁCH =====");
        for (Sach s : danhSach) {
            System.out.println(s);
        }
        System.out.println("==========================");
    }

    // 🔹 Tổng số lượng sách
    public int soLuongSach() {
        return danhSach.size();
    }

    // 🔹 Lấy danh sách (sao chép)
    public List<Sach> getDanhSach() {
        return new ArrayList<>(danhSach);
    }
}
