import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach();
        int chon;

        do {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Tìm kiếm theo mã sách");
            System.out.println("5. Cập nhật giá sách");
            System.out.println("6. Xóa sách theo mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine(); // bỏ dòng thừa

            switch (chon) {
                case 1:
                    System.out.print("Nhập mã sách: ");
                    String ma1 = sc.nextLine();
                    System.out.print("Tên sách: ");
                    String ten1 = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tg1 = sc.nextLine();
                    System.out.print("Giá: ");
                    double gia1 = sc.nextDouble();
                    System.out.print("Năm XB: ");
                    int nam1 = sc.nextInt(); sc.nextLine();
                    System.out.print("Môn học: ");
                    String mon = sc.nextLine();
                    System.out.print("Cấp độ: ");
                    String cap = sc.nextLine();
                    ql.themSach(new SachGiaoTrinh(ma1, ten1, tg1, gia1, nam1, mon, cap));
                    System.out.println(" Đã thêm sách giáo trình!");
                    break;

                case 2:
                    System.out.print("Nhập mã sách: ");
                    String ma2 = sc.nextLine();
                    System.out.print("Tên sách: ");
                    String ten2 = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tg2 = sc.nextLine();
                    System.out.print("Giá: ");
                    double gia2 = sc.nextDouble();
                    System.out.print("Năm XB: ");
                    int nam2 = sc.nextInt(); sc.nextLine();
                    System.out.print("Thể loại: ");
                    String tl = sc.nextLine();
                    System.out.print("Có phải series : ");
                    boolean series = sc.nextBoolean();
                    ql.themSach(new SachTieuThuyet(ma2, ten2, tg2, gia2, nam2,tl, series));
                    System.out.println(" Đã thêm sách tiểu thuyết!");
                    break;

                case 3:
                    System.out.println("\n=== DANH SÁCH SÁCH ===");
                    ql.hienThi();
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();
                    sach kq = ql.timKiem(maTim);
                    if (kq != null)
                        System.out.println(" Tìm thấy: " + kq);
                    else
                        System.out.println(" Không tìm thấy");
                    break;

                case 5:
                    System.out.print("Nhập mã sách cần cập nhật: ");
                    String maCap = sc.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double giaMoi = sc.nextDouble();
                    if (ql.capNhatGia(maCap, giaMoi))
                        System.out.println(" Cập nhật thành công");
                    else
                        System.out.println(" Không tìm thấy mã sách");
                    break;

                case 6:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    if (ql.xoaSach(maXoa))
                        System.out.println(" Đã xóa!");
                    else
                        System.out.println(" Không tìm thấy mã sách");
                    break;

                case 0:
                    System.out.println(" Kết thúc chương trình.");
                    break;

                default:
                    System.out.println(" Lựa chọn không hợp lệ");
            }

        } while (chon != 0);

        sc.close();
    }
}
