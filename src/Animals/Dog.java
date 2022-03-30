package Animals;

public class Dog extends Animal{
    String makesSound = "Bark bark";


    Dog(String breed, int legs, boolean isPredator){
        super.breed = breed;
        super.legs = legs;
        super.isPredator = isPredator;
    }

    public String getMakesSound() {
        return makesSound;
    }
}
