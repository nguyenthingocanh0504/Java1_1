package Day2;

import java.util.Random;
import java.util.Scanner;

public class Bai123 {
    public static void main(String[] args) {
//        Viết hàm tìm một vị trí mà giá trị tại vị trí đó là một giá trị nhỏ nhất
//        trong mảng một chiều các số nguyên.

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n=sc.nextInt();
        if(n<1){
            System.out.println("n khong hop le");
            System.exit(0);
        }
        Random random = new Random();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=random.nextInt(1000);
        }
        //in ra mang vua tao

        for(int i=0;i<n;i++){
            System.out.printf(arr1[i]+"\t");
        }

        int ViTriMin = 0;
        for (int i=1; i<n; i++)
        {
            if(arr1[ViTriMin]>arr1[i])
            {
                ViTriMin = i;
            }
        }
        System.out.println("\nVi tri min: "+(ViTriMin+1));
    }
}
