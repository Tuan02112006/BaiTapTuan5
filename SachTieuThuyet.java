public class SachTieuThuyet extends Sach {
        private String theLoai;
        private boolean laSachSeries;

        public SachTieuThuyet(String maSach, String tenSach, String tacGia, double giaTien, int namXuatBan,double giaCoban,
                              String theLoai, boolean laSachSeries) {
            super(maSach, tenSach, tacGia, giaTien, namXuatBan,giaCoban);
            this.theLoai = theLoai;
            this.laSachSeries = laSachSeries;
        }

        @Override
        public String toString() {
            return super.toString() +
                    ", Thể loại: " + theLoai +
                    ", Là sách series: " + (laSachSeries ? "Có" : "Không") +
                    ", gia ban: " + tinhgiaban();
        }
        @Override
        public double tinhgiaban() {
            int soNamXuatBan = 2025 - super.getNamXuatBan();
            if (laSachSeries) {
                return super.getGiaCoban() + 15000;
            } else {
                return super.getGiaCoban();
            }
        }
}
