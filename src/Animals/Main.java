package Animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal newPet;

        System.out.print("What pet do you want to take?" + "\n"+ "1-bird, 2-dog, 3-cat: ");
        int answer = scanner.nextInt();

        if (answer == 1){
            System.out.println("What sort of bird do you want?");
            scanner.nextLine();
            String breed = scanner.next();
            System.out.println("How many legs should it have?");
            int legs = scanner.nextInt();
            scanner.nextLine();
            if (legs > 2){
                System.out.println("Yo wtf? " + legs + " legs?");
            }
            System.out.println("Is it going to be an predator? True/False");
            boolean isPredator = scanner.nextBoolean();
            newPet = new Bird(breed, legs, isPredator);
            if (!isPredator){
                System.out.println("Congrats! This is your new bird: " + "\n" + "It likes to eat veggies, has " + newPet.legs + " legs and it's breed is " + newPet.breed );
            } else{
                System.out.println("Congrats! This is your new bird: " + "\n" + "It likes to hunt, has " + newPet.legs + " legs and it's breed is " + newPet.breed );
            }
            System.out.println("And it goes: " + newPet.getMakesSound());
        } else if (answer == 2){
            System.out.println("What sort of dog do you want?");
            scanner.nextLine();
            String breed = scanner.next();
            System.out.println("How many legs should it have?");
            int legs = scanner.nextInt();
            if (legs > 4){
                System.out.println("Yo wtf? " + legs + " legs?");
            }
            System.out.println("Is it going to be an predator? True/False");
            boolean isPredator = scanner.nextBoolean();
            newPet = new Dog(breed, legs, isPredator);
            if (isPredator){
                System.out.println("Congrats! This is your new dog: " + "\n" + "It likes to hunt, has " + newPet.legs + " legs and it's breed is " + newPet.breed );
            } else{
                System.out.println("Congrats! This is your new dog: " + "\n" + "It likes to eat veggies (very undoglikely....), has " + newPet.legs + " legs and it's breed is " + newPet.breed );
            }
            System.out.println("And it goes: " + newPet.getMakesSound());
        }else if (answer == 3){
            System.out.println("What sort of cat do you want?");
            scanner.nextLine();
            String breed = scanner.next();
            System.out.println("How many legs should it have?");
            int legs = scanner.nextInt();
            if (legs > 4){
                System.out.println("Yo wtf? " + legs + " legs?");
            }
            System.out.println("Is it going to be an predator? True/False");
            boolean isPredator = scanner.nextBoolean();
            newPet = new Cat(breed, legs, isPredator);
            if (isPredator){
                System.out.println("Congrats! This is your new cat: " + "\n" + "It likes to hunt, has " + newPet.legs + " legs and it's breed is " + newPet.breed );
            } else{
                System.out.println("Congrats! This is your new cat: " + "\n" + "It likes to eat veggies (very uncatlikely....), has " + newPet.legs + " legs and it's breed is " + newPet.breed );
            }
            System.out.println("And it goes: " + newPet.getMakesSound());
        }

    }
}
