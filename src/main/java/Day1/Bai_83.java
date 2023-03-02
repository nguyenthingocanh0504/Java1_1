package Day1;

import java.util.Scanner;

public class Bai_83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //        Viết chương trình nhập vào hai số thực. Kiểm tra xem chúng có cùng
//        dấu hay không.

        float a,b;
        System.out.println("Nhap a= ");
        a=sc.nextFloat();
        System.out.println("Nhap b= ");
        b=sc.nextFloat();

        if(a>=0&&b>=0) {
            System.out.println(a+ " cung dau voi " + b);
        }
        else {
            System.out.println(a+ " trai dau voi " + b);
        }

    }
}
