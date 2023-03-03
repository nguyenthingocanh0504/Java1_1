package Day2;

import java.util.Random;
import java.util.Scanner;

public class Bai124 {
    public static void main(String[] args) {
//        Viết hàm kiểm tra trong mảng các số nguyên có tồn tại giá trị chẵn nhỏ
//        hơn 2004 hay không?

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
        System.out.println("\nPhan tu chan va nho hon 2004");
        for (int i=1; i<n; i++)
        {
            if(arr1[i]%2==0&&arr1[i]<2004)
            {
                System.out.print(arr1[i]+"\t");
            }
        }

    }
}
