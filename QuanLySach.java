import java.util.Scanner;

public class QuanLySach {
    private Sach[] danhSachSach;
    private int soLuong; // số lượng sách hiện có

    public QuanLySach(int kichThuocToiDa) {
        danhSachSach = new Sach[kichThuocToiDa];
        soLuong = 0;
    }

    // Thêm sách
    public boolean themSach(Sach sach) {
        if (soLuong >= danhSachSach.length) {
            System.out.println("Danh sach da day, khong the them sach moi!");
            return false;
        }
        danhSachSach[soLuong] = sach;
        soLuong++;
        return true;
    }

    // Tìm sách theo mã
    public Sach timSachTheoMa(String maSach) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSachSach[i].getMaSach().equalsIgnoreCase(maSach)) {
                return danhSachSach[i];
            }
        }
        return null;
    }

    // Xóa sách theo mã
    public boolean xoaSach(String maSach) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSachSach[i].getMaSach().equalsIgnoreCase(maSach)) {
                // Dịch các phần tử phía sau lên 1 vị trí
                for (int j = i; j < soLuong - 1; j++) {
                    danhSachSach[j] = danhSachSach[j + 1];
                }
                danhSachSach[soLuong - 1] = null;
                soLuong--;
                return true;
            }
        }
        return false;
    }

    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSachSach[i].getMaSach().equalsIgnoreCase(maSach)) {
                danhSachSach[i].setTieuDe(sachMoi.getTieuDe());
                danhSachSach[i].setTacGia(sachMoi.getTacGia());
                danhSachSach[i].setNamXuatBan(sachMoi.getNamXuatBan());
                danhSachSach[i].setSoLuong(sachMoi.getSoLuong());
                return true;
            }
        }
        return false;
    }

    // Hiển thị danh sách sách
    public void hienThiDanhSach() {
        if (soLuong == 0) {
            System.out.println("Danh sách sách trống!");
            return;
        }
        for (int i = 0; i < soLuong; i++) {
            System.out.println(danhSachSach[i]);
            System.out.println("→ Giá bán ước tính: " + danhSachSach[i].tinhGiaBan() + " VNĐ");
            System.out.println("-----------------------------");
        }
    }


    // Lấy số lượng sách hiện có
    public int getSoLuong() {
        return soLuong;
    }
}
