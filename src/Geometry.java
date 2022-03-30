class Rectangle1{
    protected float sideA;
    protected float sideB;

   public Rectangle1(float sideA, float sideB){
        this.sideA =sideA;
        this.sideB =sideB;
    }
    float areaRectangle(){
        return sideA*sideB;
    }
    float perimeterRectangle(){
        return  2*(sideA+sideB);
    }
    float diagonalOfRectangle(){
        return (float) Math.sqrt((sideA*sideA)+(sideB*sideB));
    }
    void allInfoOfRectangle(){
        System.out.printf("Area: %.2f", areaRectangle());
        System.out.println();
        System.out.printf("Perimeter: %.2f", perimeterRectangle());
        System.out.println();
        System.out.printf("Diagonal: %.2f", diagonalOfRectangle());
        System.out.println();
    }
}
class Square extends Rectangle1{
    private float side;
    public Square(float side){
        super(side, side);
        this.side = side;
    }
}
class Cuboid extends Rectangle1{
    private float sideC;

    public Cuboid(float sideA, float sideB, float sideC) {
        super(sideA, sideB);
        this.sideC = sideC;
    }
    float areaOfCuboid(){
        return 2*(sideA*sideB+sideA*sideC+sideB*sideC);
    }
    float volumeOfCuboid(){
        return sideA*sideB*sideC;
    }
    float diagonalCuboid(){
        return (float) Math.sqrt((sideA*sideA)+(sideB*sideB)+(sideC*sideC));
    }
    void allInfoOfCuboid(){
        System.out.printf("Area: %.2f", areaOfCuboid());
        System.out.println();
        System.out.printf("Volume: %.2f", volumeOfCuboid());
        System.out.println();
        System.out.printf("Diagonal: %.2f", diagonalCuboid());
        System.out.println();
    }
}
class Cube extends Cuboid{
    private float side;
    Cube(float side){
        super(side, side,side);
        this.side = side;
    }
}
class Triangle{
    protected float sideA;
    protected float sideB;
    protected float sideC;

    Triangle(float sideA, float sideB, float sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    private boolean isValid(){
        return (sideA+sideB>sideC) && (sideA+sideC>sideB) && (sideC+sideB>sideA);
    }
    float perimeterOfTriangle(){
        if (isValid()){
            return sideA+sideB+sideC;
        }
      else {
            return 0;
        }
    }
    float areaOfTriangle(){
        if (isValid()){
            float p = (sideA+sideB+sideC)/2;
            return (float) Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        } else {
            return 0;
        }
    }
    void allInfoOfTriangle(){
        System.out.printf("Perimeter: %.2f", perimeterOfTriangle());
        System.out.println();
        System.out.printf("Area: %.2f", areaOfTriangle());
        System.out.println();
    }
}
class Circle{
    protected float radius;
    Circle(float radius){
        this.radius = radius;
    }
    float perimeterOfCircle(){
       return (float) Math.PI*(2*radius);
    }
    float areaOfCircle(){
        return (float)Math.PI*(radius*radius);
    }
    void allInfoOfCircle(){
        System.out.printf("Perimeter: %.2f", perimeterOfCircle());
        System.out.println();
        System.out.printf("Area: %.2f", areaOfCircle());
        System.out.println();
    }
}
class Polygon{
    private float side;
    private float numOfSides;

    Polygon(float side, float numOfSides){
        this.side=side;
        this.numOfSides = numOfSides;
    }
    float perimeterOfPolygon(){
        return side*numOfSides;
    }
    float areaOfPolygon(){
        float radius = (float)(Math.sqrt(3)/2)*side;
        return (perimeterOfPolygon()*radius)/2;
    }
    void allOfPolygon(){
        System.out.printf("Perimeter: %.2f", perimeterOfPolygon());
        System.out.println();
        System.out.printf("Area: %.2f", areaOfPolygon());
        System.out.println();
    }

}
class Cone extends Circle{
    private float height;

    Cone(float radius, float height){
        super(radius);
        this.height=height;
    }
    float areaOfCone(){
        float m = (float) Math.sqrt((super.radius*radius)+(height*height));
        return (float) Math.PI*radius*(radius+m);
    }
    float volumeOfCone(){
        return (float) (areaOfCircle()*height)/3;
    }
    void allOfCone(){
        System.out.printf("Area: %.2f", areaOfCone());
        System.out.println();
        System.out.printf("Volume: %.2f", volumeOfCone());
        System.out.println();
    }
}
class Sphere extends Circle{

    Sphere(float radius) {
        super(radius);
    }
    float areaOfSphere(){
        return (float) (4*areaOfCircle());
    }
    float volumeOfSphere(){
        return (float) (areaOfSphere()*radius)/3;
    }
    void allOfSphere(){
        System.out.printf("Area: %.2f", areaOfSphere());
        System.out.println();
        System.out.printf("Volume: %.2f", volumeOfSphere());
    }
}


public class Geometry {
    public static void main(String[] args) {

        Sphere sphere = new Sphere(5);
        sphere.allOfSphere();
    }
}
