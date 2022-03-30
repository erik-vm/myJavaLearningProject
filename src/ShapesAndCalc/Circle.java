package ShapesAndCalc;
import java.util.Scanner;

public class Circle {
    Scanner scanner = new Scanner(System.in);
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    void circle(double radius){
        this.radius = radius;
    }
    void getCircleInfo(){
        double diameter = 2*radius;
        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;
        System.out.println("---Circle info---");
        System.out.printf("Radius: %.2fcm", radius);
        System.out.printf("\n"+"Diameter: %.2fcm", diameter);
        System.out.printf("\n"+"Perimeter: %.2fcm", perimeter);
        System.out.printf("\n"+"Area: %.2fcm\u00B2", area);
    }
}
