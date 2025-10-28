import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm kiếm sách theo mã");
            System.out.println("5. Xóa sách");
            System.out.println("6. Kiểm tra tồn kho");
            System.out.println("7. Cập nhật vị trí sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            sc.nextLine(); // bỏ dòng trống

            switch (chon) {
                case 1:
                    System.out.print("Mã sách: ");
                    String maGT = sc.nextLine();
                    System.out.print("Tiêu đề: ");
                    String tdGT = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tgGT = sc.nextLine();
                    System.out.print("Giá cơ bản: ");
                    double giaGT = sc.nextDouble();
                    System.out.print("Số lượng: ");
                    int slGT = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Vị trí: ");
                    String vtGT = sc.nextLine();
                    System.out.print("Môn học: ");
                    String mhGT = sc.nextLine();
                    System.out.print("Cấp độ: ");
                    String cdGT = sc.nextLine();

                    quanLy.themSach(new SachGiaoTrinh(maGT, tdGT, tgGT, giaGT, slGT, vtGT, mhGT, cdGT));
                    System.out.println("Đã thêm sách giáo trình!");
                    break;

                case 2:
                    System.out.print("Mã sách: ");
                    String maTT = sc.nextLine();
                    System.out.print("Tiêu đề: ");
                    String tdTT = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tgTT = sc.nextLine();
                    System.out.print("Giá cơ bản: ");
                    double giaTT = sc.nextDouble();
                    System.out.print("Số lượng: ");
                    int slTT = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Vị trí: ");
                    String vtTT = sc.nextLine();
                    System.out.print("Thể loại: ");
                    String tlTT = sc.nextLine();
                    System.out.print("Có phải series (true/false): ");
                    boolean srTT = sc.nextBoolean();

                    quanLy.themSach(new SachTieuThuyet(maTT, tdTT, tgTT, giaTT, slTT, vtTT, tlTT, srTT));
                    System.out.println("Đã thêm sách tiểu thuyết!");
                    break;

                case 3:
                    System.out.println("\nDANH SÁCH SÁCH:");
                    quanLy.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTK = sc.nextLine();
                    Sach s = quanLy.timKiemSach(maTK);
                    if (s != null)
                        System.out.println(s);
                    else
                        System.out.println("Không tìm thấy sách!");
                    break;

                case 5:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maX = sc.nextLine();
                    if (quanLy.xoaSach(maX))
                        System.out.println("Đã xóa thành công!");
                    else
                        System.out.println("Không tìm thấy mã sách!");
                    break;

                case 6:
                    System.out.print("Nhập mã sách cần kiểm kho: ");
                    String maKK = sc.nextLine();
                    Sach sachKK = quanLy.timKiemSach(maKK);
                    if (sachKK != null) {
                        System.out.print("Nhập số lượng tối thiểu: ");
                        int slMin = sc.nextInt();
                        sc.nextLine();
                        if (sachKK.kiemTraTonKho(slMin))
                            System.out.println("Sách đủ tồn kho!");
                        else
                            System.out.println("Sách dưới mức tồn kho tối thiểu!");
                    } else {
                        System.out.println("Không tìm thấy mã sách!");
                    }
                    break;

                case 7:
                    System.out.print("Nhập mã sách cần cập nhật vị trí: ");
                    String maVT = sc.nextLine();
                    Sach sachVT = quanLy.timKiemSach(maVT);
                    if (sachVT != null) {
                        System.out.print("Nhập vị trí mới: ");
                        String viTriMoi = sc.nextLine();
                        sachVT.capNhatViTri(viTriMoi);
                    } else {
                        System.out.println("Không tìm thấy mã sách!");
                    }
                    break;

                case 0:
                    System.out.println("Thoát chương trình!");
                    sc.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
