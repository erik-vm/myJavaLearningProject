package ShapesAndCalc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
       Triangle triangle1 = new Triangle();
        triangle1.Triangle(4.5, 3.8, 2.5);

        System.out.println(triangle1.sideA);
        triangle1.setSideA(4);
        System.out.println(triangle1.sideA);

        boolean triangle1validation = triangle1.isValid();
        System.out.println(triangle1validation);
        triangle1.trianglePerimeter();

        Triangle triangle2 = new Triangle();
        triangle2.Triangle(12,14.5,19);
        triangle2.triangleArea();
        System.out.println();

        triangle2.triangleHeight();
        System.out.println();
        triangle2.triangleAngle();
        triangle2.setSideB(4.5);
        System.out.println();
        triangle1.triangleAngle();
        System.out.println();
        triangle1.triangleHeight();
        System.out.println();
        triangle2.triangleAngle();

        Circle circle1 = new Circle();
        circle1.circle(4.5);
        circle1.getCircleInfo();
        System.out.println();
        Circle circle2 = new Circle();
        circle2.circle(48.32);
        circle2.getCircleInfo();
        System.out.println();

        Rectangle rectangle1= new Rectangle();
        rectangle1.rectangle(4.8, 7.2);
        rectangle1.rectangleInfo();
    }
}
