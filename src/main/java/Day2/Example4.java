package Day2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        //1.1 Viet chuong trinh mo phong nhap du lieu nguoi dung
        //1.1. Viết chương trình mô phỏng nhập
        //dữ liệu người dùng.
        //Gồm có: username và password
        //(Mặc định có 1 TK user: admin và pass: admin)
        //Người dùng sẽ có tối đa 3 lần nhập.
        //-> Nếu nhập đúng -> đưa ra thông báo -> đăng nhập thành
        //công.
        //-> Nếu nhập sai (dưới 3 lần) -> cho nhập lại
        //-> Quá 3 lần -> thông báo đăng nhập thất bại
        //-> kết thúc chương trình.

        String user="",pass="";
        Scanner sc=new Scanner(System.in);
        int x=1;
        boolean isLogin = false;
        while(x<=3){
            System.out.printf("Nhap user lan %d: ",x);
            user=sc.nextLine();
            System.out.printf("Nhap pass lan %d: ",x);
            pass=sc.nextLine();
            if(user.equals("admin")==true && pass.equals("admin")==true){
                isLogin = true;
                break;
            }
            x++;
        }
        if(isLogin){
            System.out.println("Dang nhap thanh cong");
        }else
        {
            System.out.println("Dang nhap that bai");
        }
    }
}
