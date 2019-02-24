import java.lang.Math.*;

public class Circle{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double area(){    
        return Math.PI*Math.pow(this.radius,2);
    }
    public double circumference(){
        return 2*Math.PI*this.radius;
    }
}