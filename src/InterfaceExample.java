interface Vehicles{
    public void goGarage();
    public void leaveGarage();
}
interface Clothes{
    public void wash();
    public void wear();
}
interface Location{
    public void find();
}
class Car2 implements Vehicles, Location{

    @Override
    public void goGarage() {
        System.out.println("Car goes inside garage");
    }

    @Override
    public void leaveGarage() {
        System.out.println("Car leaves garage");
    }
    @Override
    public void find(){
        System.out.println("Dude, where is my car?");
    }
}
class Shirts implements Clothes, Location{

    @Override
    public void wash() {
        System.out.println("Dude, I'm washing my shirt");
    }

    @Override
    public void wear() {
        System.out.println("Dude, I'm wearing my shirt");
    }

    @Override
    public void find() {
        System.out.println("Dude, where is my shirt?");
    }
}
class InterfaceExample {
    public static void main(String[] args) {
        Car2 car2 = new Car2();
        car2.find();
        car2.goGarage();
        car2.leaveGarage();
        Shirts shirts = new Shirts();
        shirts.find();
        shirts.wash();
        shirts.wear();
    }
}
