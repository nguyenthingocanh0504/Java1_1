package Cau2;

public class KyThuat extends NhanVien{
    private String nganh;
    public KyThuat(){

    }

    public KyThuat(String nganh) {
        this.nganh = nganh;
    }

    public KyThuat(String maNhanVien, String hoTen, String namSinh, String diaChi, String nganh) {
        super(maNhanVien, hoTen, namSinh, diaChi);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "KyThuat{" +super.toString()+
                "nganh='" + nganh + '\'' +
                '}';
    }
}
