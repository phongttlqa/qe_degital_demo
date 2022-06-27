package B3;

public class ConNguoi {
    public void XYZ(){
        System.out.println("xyz frome super class");
    }

    public void XYZ(String a){
        System.out.println("xyz frome super class");
    }

    public void XYZ(String a, int b){
        System.out.println("xyz frome super class");
    }

    public int tuoi;
    public String ten;
    public boolean gioiTinh;


    public ConNguoi(int tuoi, String ten, boolean gioiTinh) {
        this.tuoi = tuoi;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
    }

    public String layThongTinConNguoi() {
        return "ConNguoi{" +
                "tuoi=" + tuoi +
                ", ten='" + ten + '\'' +
                ", gioiTinh=" + gioiTinh +
                '}';
    }

    private void ABCCCCC(){

    }

    public int getTuoi() {return tuoi;}

    public void setTuoi(int tuoi) {this.tuoi = tuoi;}

    public String getTen() {return ten;}

    public void setTen(String ten) {this.ten = ten;}

    public boolean isGioiTinh() {return gioiTinh;}

    public void setGioiTinh(boolean gioiTinh) {this.gioiTinh = gioiTinh;}
}
