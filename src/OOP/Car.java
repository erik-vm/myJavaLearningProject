package OOP;

public class Car extends Vehicle{
    String manufacturer;
    String model;
    int year;

    void carInfo(String manufacturer, String model, int year, int passengerCapacity, String color, boolean environmentFriendly){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        super.passengerCapacity = passengerCapacity;
        super.color = color;
        super.environmentFriendly = environmentFriendly;
    }
    String printInfo(){
        return this.manufacturer + "\n" + this.model + "\n" + this.year + "\n" + super.passengerCapacity + "\n" +super.color + "\n" + super.environmentFriendly;
    }
}
