import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach(100);

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Tìm kiếm sách theo mã");
            System.out.println("5. Xóa sách theo mã");
            System.out.println("6. Cập nhật sách theo mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Mã sách: ");
                    String ma1 = sc.nextLine();
                    System.out.print("Tiêu đề: ");
                    String td1 = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tg1 = sc.nextLine();
                    System.out.print("Năm XB: ");
                    int nam1 = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int sl1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Môn học: ");
                    String mh = sc.nextLine();
                    System.out.print("Cấp độ: ");
                    String cd = sc.nextLine();
                    ql.themSach(new SachGiaoTrinh(ma1, td1, tg1, nam1, sl1, mh, cd));
                    break;

                case 2:
                    System.out.print("Mã sách: ");
                    String ma2 = sc.nextLine();
                    System.out.print("Tiêu đề: ");
                    String td2 = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tg2 = sc.nextLine();
                    System.out.print("Năm XB: ");
                    int nam2 = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int sl2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Thể loại: ");
                    String tl = sc.nextLine();
                    System.out.print("Là series (true/false): ");
                    boolean series = sc.nextBoolean();
                    ql.themSach(new SachTieuThuyet(ma2, td2, tg2, nam2, sl2, tl, series));
                    break;

                case 3:
                    ql.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();
                    Sach kq = ql.timSachTheoMa(maTim);
                    if (kq != null) {
                        System.out.println("Kết quả tìm thấy:");
                        System.out.println(kq);
                    } else {
                        System.out.println("Không tìm thấy sách!");
                    }
                    break;

                case 5:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    if (ql.xoaSach(maXoa))
                        System.out.println("Đã xóa thành công!");
                    else
                        System.out.println("Không tìm thấy mã sách để xóa!");
                    break;

                case 6:
                    System.out.print("Nhập mã sách cần cập nhật: ");
                    String maCapNhat = sc.nextLine();
                    System.out.print("Tiêu đề mới: ");
                    String tdMoi = sc.nextLine();
                    System.out.print("Tác giả mới: ");
                    String tgMoi = sc.nextLine();
                    System.out.print("Năm XB mới: ");
                    int namMoi = sc.nextInt();
                    System.out.print("Số lượng mới: ");
                    int slMoi = sc.nextInt();
                    sc.nextLine();
                    Sach sachMoi = new Sach(maCapNhat, tdMoi, tgMoi, namMoi, slMoi);
                    if (ql.capNhatSach(maCapNhat, sachMoi))
                        System.out.println("Cập nhật thành công!");
                    else
                        System.out.println("Không tìm thấy mã sách!");
                    break;

                case 0:
                    System.out.println("Kết thúc chương trình!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
