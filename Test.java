import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySach();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm kiếm sách theo mã");
            System.out.println("5. Xóa sách");
            System.out.println("6. Kiểm tra tồn kho");
            System.out.println("7. Cập nhật thông tin sách"); // Đã thay đổi
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    System.out.print("Mã sách: ");
                    String maGT = sc.nextLine();
                    System.out.print("Tiêu đề: ");
                    String tdGT = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tgGT = sc.nextLine();

                    System.out.print("Năm xuất bản: ");
                    int namGT = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double giaGT = sc.nextDouble();
                    System.out.print("Số lượng: ");
                    int soLuongGT = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Vị trí (Kệ-Ngăn): ");
                    String viTriGT = sc.nextLine();
                    System.out.print("Môn học: ");
                    String monHoc = sc.nextLine();
                    System.out.print("Cấp độ: ");
                    String capDo = sc.nextLine();
                    SachGiaoTrinh sgt = new SachGiaoTrinh(maGT, tdGT, tgGT, namGT, giaGT, soLuongGT, viTriGT, monHoc, capDo);
                    quanLy.themSach(sgt);
                    System.out.println("Đã thêm sách giáo trình thành công!");
                    break;

                case 2:
                    System.out.print("Mã sách: ");
                    String maTT = sc.nextLine();
                    System.out.print("Tiêu đề: ");
                    String tdTT = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tgTT = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int namTT = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double giaTT = sc.nextDouble();
                    System.out.print("Số lượng: ");
                    int soLuongTT = sc.nextInt();
                    System.out.print("Là sách series (true/false): ");
                    boolean laSeries = sc.nextBoolean();
                    sc.nextLine();
                    System.out.print("Vị trí (Kệ-Ngăn): ");
                    String viTriTT = sc.nextLine();
                    System.out.print("Thể loại: ");
                    String theLoai = sc.nextLine();

                    SachTieuThuyet stt = new SachTieuThuyet(maTT, tdTT, tgTT, namTT, giaTT, soLuongTT, viTriTT, theLoai, laSeries);
                    quanLy.themSach(stt);
                    System.out.println("Đã thêm sách tiểu thuyết thành công!");
                    break;

                case 3:
                    quanLy.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();
                    Sach sachTim = quanLy.timKiemSach(maTim);
                    if (sachTim != null) {
                        System.out.println("\n--- KẾT QUẢ TÌM KIẾM ---");
                        System.out.println(sachTim);
                        System.out.println("-------------------------");
                    } else {
                        System.out.println("Không tìm thấy mã sách!");
                    }
                    break;

                case 5:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    if (quanLy.xoaSach(maXoa)) {
                        System.out.println("Xóa sách thành công!");
                    } else {
                        System.out.println("Không tìm thấy mã sách để xóa!");
                    }
                    break;

                case 6:
                    System.out.print("Nhập mã sách cần kiểm kê: ");
                    String maKK = sc.nextLine();
                    Sach sachKK = quanLy.timKiemSach(maKK);
                    if (sachKK != null) {
                        System.out.print("Nhập số lượng tối thiểu: ");
                        int slMin = sc.nextInt();
                        sc.nextLine();

                        if (sachKK.kiemTraTonKho(slMin))
                            System.out.println("Sách đủ tồn kho! ("+sachKK.getSoLuong()+" >= "+slMin+")");
                        else
                            System.out.println("Sách dưới mức tồn kho tối thiểu! ("+sachKK.getSoLuong()+" < "+slMin+")");
                    } else {
                        System.out.println("Không tìm thấy mã sách!");
                    }
                    break;

                case 7:
                    System.out.print("Nhập mã sách cần cập nhật: ");
                    String maCapNhat = sc.nextLine();
                    Sach sachCapNhat = quanLy.timKiemSach(maCapNhat);

                    if (sachCapNhat != null) {

                        boolean capNhatTiep = true;
                        while(capNhatTiep){
                            System.out.println("\n--- THÔNG TIN SÁCH HIỆN TẠI ---");
                            System.out.println(sachCapNhat);

                            System.out.println("\n--- CHỌN THUỘC TÍNH CẦN CẬP NHẬT ---");
                            System.out.println("1. Tiêu đề");
                            System.out.println("2. Tác giả");
                            System.out.println("3. Năm xuất bản");
                            System.out.println("4. Giá cơ bản");
                            System.out.println("5. Số lượng");
                            System.out.println("6. Vị trí");
                            System.out.println("0. Hoàn tất cập nhật và Quay lại Menu chính");
                            System.out.print("Chọn: ");
                            int chonCapNhat = sc.nextInt();
                            sc.nextLine();
                            switch (chonCapNhat) {
                                case 1:
                                    System.out.print("Nhập tiêu đề mới: ");
                                    String tdMoi = sc.nextLine();
                                    sachCapNhat.setTieuDe(tdMoi);
                                    System.out.println("-> Cập nhật Tiêu đề thành công!");
                                    break;
                                case 2:
                                    System.out.print("Nhập tác giả mới: ");
                                    String tgMoi = sc.nextLine();
                                    sachCapNhat.setTacGia(tgMoi);
                                    System.out.println("-> Cập nhật Tác giả thành công!");
                                    break;
                                case 3:
                                    System.out.print("Nhập năm xuất bản mới: ");
                                    int namMoi = sc.nextInt();
                                    sc.nextLine();
                                    sachCapNhat.setNamXuatBan(namMoi);
                                    System.out.println("-> Cập nhật Năm xuất bản thành công!");
                                    break;
                                case 4:
                                    System.out.print("Nhập giá cơ bản mới: ");
                                    double giaMoi = sc.nextDouble();
                                    sc.nextLine();
                                    sachCapNhat.setGiaCoBan(giaMoi);
                                    System.out.println("-> Cập nhật Giá cơ bản thành công! (Giá bán tự động tính lại)");
                                    break;
                                case 5:
                                    System.out.print("Nhập số lượng mới: ");
                                    int slMoi = sc.nextInt();
                                    sc.nextLine();
                                    sachCapNhat.setSoLuong(slMoi);
                                    System.out.println("-> Cập nhật Số lượng thành công!");
                                    break;
                                case 6:
                                    System.out.print("Nhập vị trí mới: ");
                                    String viTriMoi = sc.nextLine();
                                    sachCapNhat.capNhatViTri(viTriMoi);
                                    break;
                                case 0:
                                    capNhatTiep = false;
                                    System.out.println("Đã hoàn tất cập nhật cho sách có mã " + maCapNhat + ".");
                                    break;
                                default:
                                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                            }
                        }
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
