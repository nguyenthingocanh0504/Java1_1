package Day2;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        // Tao 1 mang so nguyen gom 5 phan tu
        // in ra phan tu dau tien va cuoi cung trong mang

        //khoi tao mang truc tiep
        int[] arr={1,5,8,10,20};
        // in ra phan tu dau tien
        System.out.println(arr[0]);

        //tao 1 mang gom n phan tu. Nhap gia tri cho mang va in ra

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
    }
}
