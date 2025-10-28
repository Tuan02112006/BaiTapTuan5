import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IQuanLySach ql = new QuanLySach();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Tim kiem theo ma sach");
            System.out.println("5. Xoa sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            int chon = sc.nextInt();
            sc.nextLine();

            if (chon == 0) break;

            switch (chon) {
                case 1:
                    System.out.print("Ma sach: "); String ma1 = sc.nextLine();
                    System.out.print("Tieu de: "); String td1 = sc.nextLine();
                    System.out.print("Tac gia: "); String tg1 = sc.nextLine();
                    System.out.print("Nam xuat ban: "); int nx1 = sc.nextInt();
                    System.out.print("So luong: "); int sl1 = sc.nextInt();
                    System.out.print("Gia co ban: "); double gb1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Mon hoc: "); String mh = sc.nextLine();
                    System.out.print("Cap đo: "); String cd = sc.nextLine();

                    SachGiaoTrinh sg = new SachGiaoTrinh(ma1, td1, tg1, nx1, sl1, gb1, mh, cd);
                    ql.themSach(sg);
                    break;

                case 2:
                    System.out.print("Ma sach: "); String ma2 = sc.nextLine();
                    System.out.print("Tieu de: "); String td2 = sc.nextLine();
                    System.out.print("Tac gia: "); String tg2 = sc.nextLine();
                    System.out.print("Nam xuat ban: "); int nx2 = sc.nextInt();
                    System.out.print("So luong: "); int sl2 = sc.nextInt();
                    System.out.print("Gia co ban: "); double gb2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("The loai: "); String tl = sc.nextLine();
                    System.out.print("La sach series? (true/false): "); boolean ls = sc.nextBoolean();

                    SachTieuThuyet st = new SachTieuThuyet(ma2, td2, tg2, nx2, sl2, gb2, tl, ls);
                    ql.themSach(st);
                    break;

                case 3:
                    ql.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach kq = ql.timKiemSach(maTim);
                    if (kq != null) System.out.println(kq);
                    else System.out.println("Khong tim thay!");
                    break;

                case 5:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maX = sc.nextLine();
                    ql.xoaSach(maX);
                    System.out.println("Đa xoa neu ton tai.");
                    break;
            }
        }

        sc.close();
    }
}
