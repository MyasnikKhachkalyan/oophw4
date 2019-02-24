import java.util.Scanner;

public class CircleDemo{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        Circle circle1 = new Circle(myObj.nextInt());
        System.out.println(circle1.area());
        System.out.println(circle1.circumference());
        

    }
}