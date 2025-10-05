import java.util.Scanner;

public class TestSach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách cần thêm vào thư viện: ");
        int n = sc.nextInt();
        sc.nextLine();

        Sach[] danhSach = new Sach[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin sách thứ " + (i + 1) + ":");
            System.out.print("Mã sách: ");
            String maSach = sc.nextLine();

            System.out.print("Tiêu đề: ");
            String tieuDe = sc.nextLine();

            System.out.print("Tác giả: ");
            String tacGia = sc.nextLine();

            System.out.print("Năm xuất bản: ");
            int namXuatBan = sc.nextInt();

            System.out.print("Số lượng: ");
            int soLuong = sc.nextInt();
            sc.nextLine();

            danhSach[i] = new Sach(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        }

        System.out.println("\n===== DANH SÁCH SÁCH TRONG THƯ VIỆN =====");
        for (int i = 0; i < n; i++) {
            danhSach[i].hienThiThongTin();
        }
    }
}
