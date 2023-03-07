package Cau1;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c);
        System.out.println("Chu vi hinh hinh tron la: "+c.getArea());
        System.out.println("Dien tich hinh tron la: "+c.getCircumferce());

        Circle c2 = new Circle(2);
        System.out.println(c2);
        System.out.println("Chu vi hinh hinh tron la: "+c2.getArea());
        System.out.println("Dien tich hinh tron la: "+c2.getCircumferce());

        // Test Error
        try{
            Circle c3 = new Circle(-3);
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{
            Circle c4 = new Circle(5);
            c4.setRadius(-4);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
