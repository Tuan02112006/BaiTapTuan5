public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();
        Sach sgt = new SachGiaoTrinh("S01", "Lap trinh",
                "Nguyen Van A", 2024, 3,12000,"LTHDT", "Dai Hoc");
        Sach stt = new SachTieuThuyet("T02", "Vu Tru","Pham Van B", 2020,
                5,50000,"Khoa Hoc Vien Tuong",true);
        ql.themSach(sgt);
        ql.themSach(stt);
        ql.menu();
    }
}
