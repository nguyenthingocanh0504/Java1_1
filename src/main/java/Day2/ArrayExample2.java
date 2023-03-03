package Day2;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
        // 2b1. Tạo 1 mảng ngẫu nhiên gồm n số tự nhiên từ 0-9999.
        //a. In ra mảng vừa tạo
        //b. In ra số lớn nhất và bé nhất trong mảng.
        //c. Tính trung bình cộng các giá trị trong mảng.

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

        for(int i=0;i<n;i++){
            System.out.printf(arr1[i]+"\t");
        }

        int max = arr1[0];
        for (int num: arr1) {
            if(max < num)
                max = num;
        }
        System.out.printf("\nSố lớn nhất trong mảng là: %d",max);

        double total = 0;
        for(int i=0; i<arr1.length; i++){
            total = total + arr1[i];
        }
        double average = total / arr1.length;
        System.out.format("\nTBC kết quả là: %.2f", average);
    }
}
