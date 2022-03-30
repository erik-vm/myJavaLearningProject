package OOP;

public class Main {
    public static void main(String[] args) {
        Human Pam = new Human();
        Pam.enterInfo("Pam", 30, "female", "receptionist");
        Pam.getInfo();

        Human Jim = new Human();
        Jim.enterInfo("Jim", 32, "male", "salesman");
        Jim.getInfo();

        Car Tesla = new Car();
        Tesla.carInfo("Tesla", "Model 3", 2022, 4, "black", true);
        String teslaInfo = Tesla.printInfo();
        System.out.println(teslaInfo);

    }
}
