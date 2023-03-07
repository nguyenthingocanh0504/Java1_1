package Cau3;

public class main {
    public static void main(String[] args) {
        VanBan st=new VanBan("   Nguyen   thi ngoc anh");
        System.out.println(st);
        System.out.println("So tu trong doan van: "+st.demSoTu());
        System.out.println("Chuan hoa tu: "+st.chuanHoaVanBan());
        System.out.println("Chuyen thanh viet hoa: "+st.vietHoaToanBo());
        System.out.println("Chuyen toan bo thanh viet thuong: "+st.vietThuongToanBo());
        System.out.println("Viet hoa chu cai dau"+st.vietHoaChuCaiDauTien());
    }
}
