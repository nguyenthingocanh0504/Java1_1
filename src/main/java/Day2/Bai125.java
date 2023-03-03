package Day2;

import java.util.Random;
import java.util.Scanner;

public class Bai125 {
    public static void main(String[] args) {
//        Viết hàm đếm số lượng số nguyên tố nhỏ hơn 100 trong mảng.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang n: ");
        int n=sc.nextInt();
        if(n<1){
            System.out.println("n khong hop le");
            System.exit(0);
        }

        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        //in ra mang vua tao
        System.out.println("\nMang vua tao: ");
        for(int i=0;i<n;i++){
            System.out.printf(arr1[i]+"\t");
        }

        if(n<=1){
            System.out.println("khong hop le");
            System.exit(0);
        }
        boolean flag=true;
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                break;
            }
            count++;
        }
        System.out.printf("\nCo %d so nguyen to",count);
    }
}
