package Animals;

public class Cat extends Animal{
    String makesSound = "Meow meow";


    Cat(String breed, int legs, boolean isPredator){
        super.breed = breed;
        super.legs = legs;
        super.isPredator = isPredator;
    }

    public String getMakesSound() {
        return makesSound;
    }
}
