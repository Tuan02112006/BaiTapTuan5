import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<Sach> danhSach;
    private Scanner sc;

    public QuanLySach() {
        danhSach = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    // --- Thêm sách có sẵn (nạp chồng phương thức)
    public void themSach(Sach s) {
        danhSach.add(s);
    }
    // ======= THÊM SÁCH =======
    public void themSach() {
        System.out.println("Chọn loại sách muốn thêm:");
        System.out.println("1. Sách giáo trình");
        System.out.println("2. Sách tiểu thuyết");
        System.out.print("Nhập lựa chọn: ");
        int chon = Integer.parseInt(sc.nextLine());

        System.out.print("Mã sách: ");
        String ma = sc.nextLine();
        System.out.print("Tiêu đề: ");
        String td = sc.nextLine();
        System.out.print("Tác giả: ");
        String tg = sc.nextLine();
        System.out.print("Năm xuất bản: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.print("Số lượng: ");
        int sl = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá cơ bản: ");
        double cb = sc.nextDouble();
        sc.nextLine(); // bỏ dòng trống
        Sach s= null;
        if (chon == 1) {
            System.out.print("Môn học: ");
            String mon = sc.nextLine();
            System.out.print("Cấp độ: ");
            String cap = sc.nextLine();
            s = new SachGiaoTrinh(ma, td, tg, nam, sl,cb, mon, cap);
        } else if (chon == 2) {
            System.out.print("Thể loại: ");
            String theLoai = sc.nextLine();
            System.out.print("Có phải series (true/false): ");
            boolean series = Boolean.parseBoolean(sc.nextLine());
            s = new SachTieuThuyet(ma, td, tg, nam, sl, cb, theLoai, series);
        }
        danhSach.add(s);
        System.out.println("- Thêm sách thành công!");
    }

    // ======= HIỂN THỊ =======
    public void hienThi() {
        if (danhSach.isEmpty()) {
            System.out.println("- Danh sách rỗng!");
            return;
        }
        System.out.println("\n=== DANH SÁCH SÁCH ===");
        for (Sach s : danhSach) {
            System.out.println(s);
            System.out.println("-------------------");
        }
    }

    // ======= TÌM THEO MÃ =======
    public Sach timTheoMa(String ma) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                return s;
            }
        }
        return null;
    }
    // ======= XÓA SÁCH =======
    public void xoaSach() {
        System.out.print("Nhập mã sách cần xóa: ");
        String ma = sc.nextLine();
        Sach s = timTheoMa(ma);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("- Đã xóa sách có mã: " + ma);
        } else {
            System.out.println("- Không tìm thấy sách!");
        }
    }
    // ======= CẬP NHẬT =======
    public void capNhat() {
        System.out.print("Nhập mã sách cần cập nhật: ");
        String ma = sc.nextLine();
        Sach s = timTheoMa(ma);
        if (s == null) {
            System.out.println("- Không tìm thấy sách!");
            return;
        }

        System.out.println("Nhập thông tin mới (bỏ trống để giữ nguyên):");
        System.out.print("Tiêu đề: ");
        String td = sc.nextLine();
        if (!td.isEmpty())
            s.setTieuDe(td);

        System.out.print("Tác giả: ");
        String tg = sc.nextLine();
        if (!tg.isEmpty())
            s.setTacGia(tg);

        System.out.print("Năm xuất bản (Enter bỏ qua): ");
        String namStr = sc.nextLine();
        if (!namStr.isEmpty())
            s.setNamXuatBan(Integer.parseInt(namStr));

        System.out.print("Số lượng (Enter bỏ qua): ");
        String slStr = sc.nextLine();
        if (!slStr.isEmpty())
            s.setSoLuong(Integer.parseInt(slStr));

        // nếu là giáo trình
        if (s instanceof SachGiaoTrinh sg) {
            System.out.print("Môn học: ");
            String mon = sc.nextLine();
            if (!mon.isEmpty()) sg.setMonHoc(mon);

            System.out.print("Cấp độ: ");
            String cap = sc.nextLine();
            if (!cap.isEmpty()) sg.setCapDo(cap);
        }

        // nếu là tiểu thuyết
        if (s instanceof SachTieuThuyet st){
            System.out.print("Thể loại: ");
            String tl = sc.nextLine();
            if (!tl.isEmpty()) st.settheLoai(tl);

            System.out.print("Là series (true/false, Enter bỏ qua): ");
            String bool = sc.nextLine();
            if (!bool.isEmpty()) st.setLaSachSeries(Boolean.parseBoolean(bool));
        }

        System.out.println("- Cập nhật thành công!");
    }

    // ======= MENU CHÍNH =======
    public void menu() {
        int chon;
        do {
            System.out.println("\n----- MENU QUẢN LÝ SÁCH -----");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm sách theo mã");
            System.out.println("4. Xóa sách");
            System.out.println("5. Cập nhật sách");
            System.out.println("0. Thoát");
            System.out.print("-> Chọn : ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> themSach();
                case 2 -> hienThi();
                case 3 -> {
                    System.out.print("Nhập mã cần tìm: ");
                    String ma = sc.nextLine();
                    Sach s = timTheoMa(ma);
                    if (s != null) System.out.println(s);
                    else System.out.println(" Không tìm thấy!");
                }
                case 4 -> xoaSach();
                case 5 -> capNhat();
                case 0 -> System.out.println(" Kết thúc chương trình!");
                default -> System.out.println("️ Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);
    }
}
