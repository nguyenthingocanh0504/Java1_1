package Day2;

import java.util.Scanner;

public class Bai33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n dau can: ");
        int x=sc.nextInt();
        int count=0;
        double s=0;
        if(x<1){
            System.out.println("Khong hop le");
            System.exit(0);
        }
        while(count<=x){
            double t=2+s;
            s=Math.sqrt(t+2);
            count++;
        }
        System.out.printf("S(%d) = %f",x,s);
    }
}
