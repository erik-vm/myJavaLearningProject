package ShapesAndCalc;

public class Rectangle {
    double sideA;
    double sideB;
    double diagonal;
    double perimeter;
    double area;

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getDiagonal() {
        return diagonal;
    }
    void rectangle(double sideA, double sideB){
        this.sideA =sideA;
        this.sideB=sideB;
        this.perimeter = 2*(sideA+sideB);
        this.area = sideA*sideB;
        this.diagonal = Math.sqrt(sideA*sideA+sideB*sideB);
    }
    void rectangleInfo(){
        System.out.println("---Rectangle info---");
        System.out.printf("Perimeter: %.2fcm", perimeter);
        System.out.printf("\n"+"Area: %.2fcm\u00B2", area);
        System.out.printf("\n"+"Diagonal: %.2fcm", diagonal);
        System.out.println();
    }
}
