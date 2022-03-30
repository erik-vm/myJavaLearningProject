package ShapesAndCalc;
import java.util.Scanner;

public class CreateShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        System.out.println("What shape do you want to create?" +"\n"+"Press number of your choice:"+ "\n" + "1-circle, 2-triangle, 3-rectangle");
        int answer = scanner.nextInt();

        if (answer == 1){
            System.out.println("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            circle.circle(radius);
            System.out.println("Congrats! You have created a circle!");
            circle.getCircleInfo();
        } else if (answer == 2){
            System.out.println("Enter side A:");
            double sideA = scanner.nextDouble();
            System.out.println("Enter side B:");
            double sideB = scanner.nextDouble();;
            System.out.println("Enter side C:");
            double sideC = scanner.nextDouble();
            triangle.Triangle(sideA, sideB, sideC);
            if (triangle.isValid()){
                System.out.println("Yeah baby yeah! That's one nice triangle"+"\n"+"What do want to know about it?"+"\n"+"1-area, 2-perimeter, 3-height, 4-angle, 5-everything you have");
               int answer2 = scanner.nextInt();
               if (answer2==1){
                   triangle.triangleArea();
               }else if(answer2 == 2){
                   triangle.trianglePerimeter();
               }else if(answer2 == 3){
                   triangle.triangleHeight();
               }else if (answer2 == 4){
                   triangle.triangleAngle();
               }else if (answer2 == 5){
                   triangle.triangleArea();
                   System.out.println();
                   triangle.trianglePerimeter();
                   triangle.triangleHeight();
                   System.out.println();
                   triangle.triangleAngle();
               }
               else {
                   System.out.println("Sorry mate! We don't provide info like that. Maybe ask your mom...");
               }
            }else{
                System.out.println("Oops! You cant create triangle like that.");
            }
        } else if (answer == 3){
            System.out.println("Enter side A:");
            double sideA = scanner.nextDouble();
            System.out.println("Enter side B");
            double sideB = scanner.nextDouble();
            rectangle.rectangle(sideA, sideB);
            System.out.println("Well that's all squared up...u got it?");
            rectangle.rectangleInfo();
        }
    }
}
