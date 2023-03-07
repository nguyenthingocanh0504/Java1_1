package Cau2;

public class NhanVien {
    private String MaNhanVien;
    private String HoTen;
    private String NamSinh;
    private String DiaChi;
    public NhanVien(){

    }

    public NhanVien(String maNhanVien, String hoTen, String namSinh, String diaChi) {
        MaNhanVien = maNhanVien;
        HoTen = hoTen;
        NamSinh = namSinh;
        DiaChi = diaChi;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        MaNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String namSinh) {
        NamSinh = namSinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }
    public String moTaCongViec(){
        return "Ho tro ky thuat";
    }

    @Override
    public String toString() {
        return "NhanVien[" +
                "MaNhanVien='" + MaNhanVien + '\'' +
                ", HoTen='" + HoTen + '\'' +
                ", NamSinh='" + NamSinh + '\'' +
                ", DiaChi='" + DiaChi + '\'';
    }
}
