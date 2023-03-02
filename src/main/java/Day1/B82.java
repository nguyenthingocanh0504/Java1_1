package Day1;

import java.util.Scanner;

public class B82 {
    public static void main(String[] args) {
//        Viết chương trình tìm số lớn nhất trong ba số thực a, b, c.
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        System.out.println("Nhap a= ");
        a=sc.nextFloat();
        System.out.println("Nhap b= ");
        b=sc.nextFloat();
        System.out.println("Nhap c= ");
        c=sc.nextFloat();
        if(a>b&&a>c) {
            System.out.println("So lon nhat la " + a);
        }
        else {
            if (b > a && b > c) {
                System.out.println("so lon nhat la " + b);
            } else {
                System.out.println("So lon nhat la " + c);
            }
        }
    }
}
