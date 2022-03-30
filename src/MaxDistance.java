import java.util.Scanner;

class Vehicle{
    protected double tankSize;
    protected double fuelUsage;
    protected int passengers;

    Vehicle(double tankSize, double fuelUsage, int passengers){
        if (tankSize>0){
            this.tankSize = tankSize;
        }else {
            this.tankSize = 0;
        }if (fuelUsage>0){
            this.fuelUsage=fuelUsage;
        }else {
            this.fuelUsage = 0;
        }if (passengers > 0){
            this.passengers=passengers;
        }else {
            this.passengers=0;
        }
    }
    double maxDistance(){
        return (tankSize/(fuelUsage*((passengers*0.05)+1)))*100;
    }
}
class Car extends Vehicle{

    boolean AC = false;

    Car(double tankSize, double fuelUsage, int passengers, boolean AC) {
        super(tankSize, fuelUsage, passengers);
        this.AC = AC;
    }
    @Override
    double maxDistance(){
        if (!AC){
            return (tankSize/(fuelUsage*((passengers*0.05)+1)))*100;
        }else {
            return (tankSize/(fuelUsage*((passengers*0.05)+1)*1.1))*100;
        }
    }
}


public class MaxDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     /*   System.out.println("Enter tank size, fuel usage per km and amount of passengers: ");
        double tankSize = scanner.nextDouble();
        double fuelUsage = scanner.nextDouble();
        int passengers = scanner.nextInt();

        Vehicle vehicle = new Vehicle(tankSize,fuelUsage,passengers);
        System.out.printf("Vehicle will travel: %.2f", vehicle.maxDistance());*/

        System.out.println("Enter tank size, fuel usage per km and amount of passengers: ");
        double tankSize = scanner.nextDouble();
        double fuelUsage = scanner.nextDouble();
        int passengers = scanner.nextInt();
        boolean AC = false;
        System.out.println("Will you turn on the AC? Y/N");
        char response = scanner.next().charAt(0);
        response = Character.toUpperCase(response);
        if (response=='Y'){
            AC = true;
        }
        Car car = new Car(tankSize,fuelUsage,passengers,AC);
        System.out.printf("Car will travel: %.2f", car.maxDistance());
    }
}
