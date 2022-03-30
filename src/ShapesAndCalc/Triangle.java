package ShapesAndCalc;
import java.util.Scanner;
public class Triangle {
    Scanner scanner = new Scanner(System.in);

    double sideA;
    double sideB;
    double sideC;

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }

    void Triangle(double sideA, double sideB, double sideC){
    this.sideA =sideA;
    this.sideB = sideB;
    this.sideC = sideC;
    }
    boolean isValid(){
        if (this.sideA + this.sideC > this.sideB && this.sideA + this.sideB > this.sideC && this.sideC + this.sideC > this.sideA){
            return true;
        }else{
            return false;
        }
    }
    void trianglePerimeter(){
        if (isValid()){
            System.out.println("The perimeter of the triangle is: " + (this.sideA+this.sideB+this.sideC)+"cm");
        }else{
            System.out.println("Invalid triangle");
        }
    }
    void triangleArea(){
        if (isValid()){
            double p = (this.sideA+this.sideB+this.sideC)/2;
            System.out.printf("Area of the triangle is: %.2fcm\u00B2",  Math.sqrt(p*(p-this.sideA)*(p-this.sideB)*(p-this.sideC)));
        }
    }
    double triangleArea2(){
        if (isValid()){
            double p = (this.sideA+this.sideB+this.sideC)/2;
            return Math.sqrt(p*(p-this.sideA)*(p-this.sideB)*(p-this.sideC));
        }else{
            return 0;
        }
    }
    void triangleHeight() {
        if (isValid()) {
            double height=0;
            System.out.println("Enter the bottom side (1,2 or 3):");
            int bottomSide = scanner.nextInt();

            if (bottomSide == 1){
                height = (triangleArea2()*2)/sideA;
            }else if (bottomSide == 2){
                height = (triangleArea2()*2)/sideB;
            }else if (bottomSide == 3){
                height = (triangleArea2()*2)/sideC;
            }else {
                System.out.println("This side does not exist.");
            }
            System.out.printf("Height: %.2fcm ", height);
        }
    }
    void triangleAngle(){
        if (isValid()) {
            double angle=0;
            System.out.println("Enter the opposite side (1,2 or 3):");
            int oppositeSide = scanner.nextInt();

            if (oppositeSide == 1){
                angle = Math.acos(((sideB*sideB)+(sideC*sideC)-(sideA*sideA))/(2*sideB*sideC));
                angle = Math.toDegrees(angle);
            }else if (oppositeSide == 2){
                angle = Math.acos(((sideA*sideA)+(sideC*sideC)-(sideB*sideB))/(2*sideA*sideC));
                angle = Math.toDegrees(angle);
            }else if (oppositeSide == 3){
                angle = Math.acos(((sideA*sideA)+(sideB*sideB)-(sideC*sideC))/(2*sideB*sideA));
                angle = Math.toDegrees(angle);
            }else {
                System.out.println("This side does not exist.");
            }
            System.out.printf("Angle: %.2f degrees ", angle);
        }
    }
}
