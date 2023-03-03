package Day2;

import java.util.Scanner;

public class Example3_while {
    public static void main(String[] args) {
        // nhập chuỗi từ bản phím -> in ra chuỗi in hoa
        // chuong trình sẽ dừng khi người dùng nhập exit
        // a-> A
        String s="";
        Scanner sc=new Scanner(System.in);

        while(s.equals("EXIT")==false){
            System.out.print("Nhap chuoi ");
            s=sc.nextLine();
            if(s.equalsIgnoreCase("exit")){
                //Thoat vong lap
                break;
            };
            s=s.toUpperCase();
            System.out.println("Viet hoa: "+s);
        }

        // in cac so tu 1-10 dung while
        System.out.println("Nhap n= ");
        int x=sc.nextInt();
        while(x<=10){
            int i=x;
            System.out.print(i+"\t");
            i++;
        }
    }
}
