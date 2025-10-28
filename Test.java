// Test.java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQuanLySach quanLy = new QuanLySach(); // Gọi theo interface

        int chon;
        do {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm Sách Giáo Trình");
            System.out.println("2. Thêm Sách Tiểu Thuyết");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Tìm kiếm theo tiêu đề");
            System.out.println("5. Xóa sách theo tiêu đề");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine(); // bỏ dòng thừa

            switch (chon) {
                case 1 -> {
                    System.out.println("\n=== Thêm Sách Giáo Trình ===");
                    System.out.print("Tiêu đề: ");
                    String tieuDe = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tacGia = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int nam = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double giaCoBan = sc.nextDouble();
                    System.out.print("Số lượng: ");
                    int soLuong = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Vị trí: ");
                    String viTri = sc.nextLine();
                    System.out.print("Môn học: ");
                    String monHoc = sc.nextLine();
                    System.out.print("Cấp độ: ");
                    String capDo = sc.nextLine();

                    SachGiaoTrinh sg = new SachGiaoTrinh(tieuDe, tacGia, nam, giaCoBan, soLuong, viTri, monHoc, capDo);
                    quanLy.themSach(sg);
                    System.out.println(" Đã thêm Sách Giáo Trình thành công!");
                }

                case 2 -> {
                    System.out.println("\n=== Thêm Sách Tiểu Thuyết ===");
                    System.out.print("Tiêu đề: ");
                    String tieuDe = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tacGia = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int nam = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double giaCoBan = sc.nextDouble();
                    System.out.print("Số lượng: ");
                    int soLuong = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Vị trí: ");
                    String viTri = sc.nextLine();
                    System.out.print("Thể loại: ");
                    String theLoai = sc.nextLine();
                    System.out.print("Tên series (nếu có, nhập '-' nếu không): ");
                    String series = sc.nextLine();

                    SachTieuThuyet st = new SachTieuThuyet(tieuDe, tacGia, nam, giaCoBan, soLuong, viTri, theLoai, series);
                    quanLy.themSach(st);
                    System.out.println(" Đã thêm Sách Tiểu Thuyết thành công!");
                }

                case 3 -> {
                    System.out.println("\n=== DANH SÁCH SÁCH ===");
                    quanLy.hienThiDanhSach();
                }

                case 4 -> {
                    System.out.print("Nhập tiêu đề sách cần tìm: ");
                    String tieuDe = sc.nextLine();
                    Sach ketQua = quanLy.timKiemSach(tieuDe);
                    if (ketQua != null)
                        System.out.println("Tìm thấy: " + ketQua);
                    else
                        System.out.println(" Không tìm thấy sách nào!");
                }

                case 5 -> {
                    System.out.print("Nhập tiêu đề sách cần xóa: ");
                    String tieuDe = sc.nextLine();
                    if (quanLy.xoaSach(tieuDe))
                        System.out.println("Đã xóa sách \"" + tieuDe + "\" thành công!");
                    else
                        System.out.println(" Không tìm thấy sách cần xóa!");
                }

                case 0 -> System.out.println(" Kết thúc chương trình!");

                default -> System.out.println(" Lựa chọn không hợp lệ!");
            }

        } while (chon != 0);

        sc.close();
    }
}
