 package bean;
 
public class GioHangbean {
        private String masach;
    private String tensach;
    private String tacgia;
    private Long gia;
    private Long slmua;
    private Long thanhtien;
        public String getMasach() {
                return masach;
        }
        public void setMasach(String masach) {
                this.masach = masach;
        }
        public String getTensach() {
                return tensach;
        }
        public void setTensach(String tensach) {
                this.tensach = tensach;
        }
        public String getTacgia() {
                return tacgia;
        }
        public void setTacgia(String tacgia) {
                this.tacgia = tacgia;
        }
        public Long getGia() {
                return gia;
        }
        public void setGia(Long gia) {
                this.gia = gia;
        }
        public Long getSlmua() {
                return slmua;
        }
        public void setSlmua(Long slmua) {
                this.slmua = slmua;
        }
        public Long getThanhtien() {
                return thanhtien;
        }
        public void setThanhtien(Long thanhtien) {
                this.thanhtien = thanhtien;
        }
   
        public GioHangbean(String masach, String tensach, String tacgia, Long gia, Long slmua) {
                super();
                this.masach = masach;
                this.tensach = tensach;
                this.tacgia = tacgia;
                this.gia = gia;
                this.slmua = slmua;
                this.thanhtien=slmua*gia;
        }
        public GioHangbean() {
                super();
                // TODO Auto-generated constructor stub
        }
       
}