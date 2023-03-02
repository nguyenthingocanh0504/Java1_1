package Day1;

import java.util.Scanner;

public class Bai_96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Viết chương trình nhập giá trị x sau khi tính giá trị của hàm số:
//        2𝑥 ^2 + 5𝑥 + 9 𝑘ℎ𝑖 𝑥 ≥ 5
//        −2𝑥 ^2 + 4𝑥 − 9 𝑘ℎ𝑖 𝑥 < 5
          float x;
        System.out.println("Nhap x= ");
        x=sc.nextFloat();
        if(x>=5){
            System.out.println("F(x) = " + (float)(2*x*x+5*x+9));
        }else {
            System.out.println("F(x) = " + (float)(-2*x*x+4*x-9));
        }
    }
}
