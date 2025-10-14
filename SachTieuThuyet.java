public class SachTieuThuyet extends sach {
        private String theLoai;
        private boolean laSachSeries;

        public SachTieuThuyet(String maSach, String tenSach, String tacGia, double giaTien, int namXuatBan,
                              String theLoai, boolean laSachSeries) {
            super(maSach, tenSach, tacGia, giaTien, namXuatBan);
            this.theLoai = theLoai;
            this.laSachSeries = laSachSeries;
        }

        @Override
        public String toString() {
            return super.toString() +
                    ", Thể loại: " + theLoai +
                    ", Là sách series: " + (laSachSeries ? "Có" : "Không");
        }

}
