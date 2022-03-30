package Animals;

public class Bird extends Animal{
    String makesSound = "Tweet tweet";

    Bird(String breed, int legs, boolean isPredator){
        super.breed = breed;
        super.legs = legs;
        super.isPredator = isPredator;
    }

    public String getMakesSound() {
        return makesSound;
    }
}
