// IQuanLySach.java
import java.util.List;

public interface IQuanLySach {

    // Thêm một cuốn sách vào danh sách
    void themSach(Sach sach);

    // Tìm kiếm sách theo tiêu đề
    Sach timKiemSach(String tieuDe);

    // Xóa sách theo tiêu đề
    boolean xoaSach(String tieuDe);

    // Hiển thị toàn bộ danh sách sách
    void hienThiDanhSach();

    // (Tuỳ chọn thêm) Lấy danh sách hiện tại
    List<Sach> getDanhSachSach();
}
