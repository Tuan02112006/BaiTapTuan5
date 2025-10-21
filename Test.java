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
                case 1 -> {
                    System.out.println("=== Thêm Sách Giáo Trình ===");
                    System.out.print("Mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Tên sách: ");
                    String ten = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tg = sc.nextLine();
                    System.out.print("Giá tiền: ");
                    double gia = sc.nextDouble();
                    System.out.print("Năm xuất bản: ");
                    int nam = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double giaCoBan = sc.nextDouble();
                    sc.nextLine(); // bỏ dòng
                    System.out.print("Môn học: ");
                    String mon = sc.nextLine();
                    System.out.print("Cấp độ: ");
                    String capDo = sc.nextLine();

                    ql.themSach(new SachGiaoTrinh(ma, ten, tg, gia, nam, giaCoBan, mon, capDo));
                    System.out.println(" Đã thêm sách giáo trình!");
                }

                case 2 -> {
                    System.out.println("=== Thêm Sách Tiểu Thuyết ===");
                    System.out.print("Mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Tên sách: ");
                    String ten = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tg = sc.nextLine();
                    System.out.print("Giá tiền: ");
                    double gia = sc.nextDouble();
                    System.out.print("Năm xuất bản: ");
                    int nam = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double giaCoBan = sc.nextDouble();
                    sc.nextLine(); // bỏ dòng
                    System.out.print("Thể loại: ");
                    String theLoai = sc.nextLine();
                    System.out.print("Có phải sách series (true/false): ");
                    boolean laSeries = sc.nextBoolean();

                    ql.themSach(new SachTieuThuyet(ma, ten, tg, gia, nam, giaCoBan, theLoai, laSeries));
                    System.out.println(" Đã thêm sách tiểu thuyết!");
                }

                case 3 -> ql.hienThi();

                case 4 -> {
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();
                    Sach kq = ql.timKiem(maTim);
                    if (kq != null)
                        System.out.println(" Tìm thấy: " + kq);
                    else
                        System.out.println(" Không tìm thấy sách!");
                }

                case 5 -> {
                    System.out.print("Nhập mã sách cần cập nhật: ");
                    String maCap = sc.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double giaMoi = sc.nextDouble();
                    if (ql.capNhatGia(maCap, giaMoi))
                        System.out.println(" Cập nhật thành công!");
                    else
                        System.out.println(" Không tìm thấy mã sách!");
                }

                case 6 -> {
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    if (ql.xoaSach(maXoa))
                        System.out.println(" Đã xóa sách!");
                    else
                        System.out.println(" Không tìm thấy mã sách!");
                }

                case 0 -> System.out.println(" Kết thúc chương trình!");

                default -> System.out.println("⚠ Lựa chọn không hợp lệ!");
            }

        } while (chon != 0);

        sc.close();
    }
}
