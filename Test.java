import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach(100);

        // 🧱 Thêm dữ liệu mẫu để test nhanh
        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT01", "Giải Tích 1", "Nguyễn Văn A", 2020, 50, 100000, "Toán", "Đại học");
        SachTieuThuyet st1 = new SachTieuThuyet("TT01", "Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 2015, 30, 80000, "Phiêu lưu", true);

        ql.themSach(sg1);
        ql.themSach(st1);

        int chon;
        do {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Tìm kiếm sách theo mã");
            System.out.println("5. Xóa sách theo mã");
            System.out.println("6. Cập nhật sách theo mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();
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
                    System.out.print("Giá cơ bản: ");
                    double gia1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Môn học: ");
                    String mh = sc.nextLine();
                    System.out.print("Cấp độ: ");
                    String cd = sc.nextLine();
                    ql.themSach(new SachGiaoTrinh(ma1, td1, tg1, nam1, sl1, gia1, mh, cd));
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
                    System.out.print("Giá cơ bản: ");
                    double gia2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Thể loại: ");
                    String tl = sc.nextLine();
                    System.out.print("Là series (true/false): ");
                    boolean series = sc.nextBoolean();
                    ql.themSach(new SachTieuThuyet(ma2, td2, tg2, nam2, sl2, gia2, tl, series));
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
                        System.out.printf("Giá bán ước tính: %.0f VNĐ\n", kq.tinhGiaBan());
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
                    System.out.print("Giá cơ bản mới: ");
                    double giaMoi = sc.nextDouble();
                    sc.nextLine();
                    Sach sachMoi = new SachGiaoTrinh(maCapNhat, tdMoi, tgMoi, namMoi, slMoi, giaMoi, "Cập nhật", "N/A");
                    if (ql.capNhatSach(maCapNhat, sachMoi))
                        System.out.println("Cập nhật thành công!");
                    else
                        System.out.println("Không tìm thấy mã sách!");
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);
    }
}
