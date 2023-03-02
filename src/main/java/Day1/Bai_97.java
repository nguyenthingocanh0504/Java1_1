package Day1;

import java.util.Scanner;

public class Bai_97 {
    public static void main(String[] args) {
        //        Viết chương trình nhập 3 cạnh của một tam giác. Hãy cho biết đó làtam giác gì?

        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a= ");
        a=sc.nextFloat();
        System.out.println("Nhap b= ");
        b=sc.nextFloat();
        System.out.println("Nhap c= ");
        c=sc.nextFloat();
        if(a + b <= c || a + c <= b ||  b + c <= a)
        {
            System.out.println("\nTam giac khong hop le. Xin kiem tra lai !");
        }
        else
        {
            System.out.println("\nDay la tam giac: ");
            if((a == b) && (b == c))
            {
                System.out.println("Deu");
            }
            else
            {
                if(a * a + b * b == c * c || a * c + c * c == b * b || b * b + c * c == a * c)
                {
                    System.out.println("Vuong");
                }
                if(a == b || a == c || b == c)
                {
                    System.out.println("Can");
                }
                else
                {
                    System.out.println("Thuong");
                }
            }
        }
    }
}
