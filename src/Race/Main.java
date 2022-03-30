package Race;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner =new Scanner(System.in);

        Vehicle vehicle1;
        Vehicle vehicle2;
        Vehicle vehicle3;
        Vehicle vehicle4;

        String racer1 = "";
        String racer2 = "";
        String racer3 = "";
        String racer4 = "";

        double racerOneSpeed = 0;
        double racerTwoSpeed = 0;
        double racerThreeSpeed = 0;
        double racerFourSpeed = 0;

        System.out.println("Are you ready to rumble? Please choose 4 vehicles for the race: " + "\n" + "1-car, 2-bicycle, 3-plane, 4-boat");
        System.out.print("Vehicle number 1: ");
        int answer1 = scanner.nextInt();
        System.out.print("Vehicle number 2: ");
        int answer2 = scanner.nextInt();
        System.out.print("Vehicle number 3: ");
        int answer3 = scanner.nextInt();
        System.out.print("Vehicle number 4: ");
        int answer4 = scanner.nextInt();

        if (answer1 == 1){
            vehicle1 = new Car();
            System.out.println("Give your racer a name: ");
            racer1 = scanner.next();
            racerOneSpeed= random.nextInt(180)+1;
        }else if (answer1 == 2){
            vehicle1 = new Bicycle();
            System.out.println("Give your racer a name: ");
            racer1 = scanner.next();
            racerOneSpeed = random.nextInt(80)+1;
        }else if (answer1 == 3){
            vehicle1 = new Plane();
            System.out.println("Give your racer a name: ");
            racer1 = scanner.next();
            racerOneSpeed = random.nextInt(1600)+1;
        }else if (answer1 ==4){
            vehicle1 = new Boat();
            System.out.println("Give your racer a name: ");
            racer1 = scanner.next();
            racerOneSpeed = random.nextInt(120)+1;
        }else {
            System.out.println("Something went wrong!");
        }if (answer2 == 1){
            vehicle2 = new Car();
            System.out.println("Give your racer a name: ");
            racer2 = scanner.next();
            racerTwoSpeed = random.nextInt(180)+1;
        }else if (answer2 == 2){
            vehicle2 = new Bicycle();
            System.out.println("Give your racer a name: ");
            racer2 = scanner.next();
            racerTwoSpeed = random.nextInt(80)+1;
        }else if (answer2 == 3){
            vehicle2 = new Plane();
            System.out.println("Give your racer a name: ");
            racer2 = scanner.next();
            racerTwoSpeed = random.nextInt(1600)+1;
        }else if (answer2 ==4){
            vehicle2 = new Boat();
            System.out.println("Give your racer a name: ");
            racer2 = scanner.next();
            racerTwoSpeed = random.nextInt(120)+1;
        }else {
            System.out.println("Something went wrong!");
        }if (answer3 == 1){
            vehicle3 = new Car();
            System.out.println("Give your racer a name: ");
            racer3 = scanner.next();
            racerThreeSpeed = random.nextInt(180)+1;
        }else if (answer3 == 2){
            vehicle3 = new Bicycle();
            System.out.println("Give your racer a name: ");
            racer3 = scanner.next();
            racerThreeSpeed = random.nextInt(80)+1;
        }else if (answer3 == 3){
            vehicle3 = new Plane();
            System.out.println("Give your racer a name: ");
            racer3 = scanner.next();
            racerThreeSpeed = random.nextInt(1600)+1;
        }else if (answer3 ==4){
            vehicle3 = new Boat();
            System.out.println("Give your racer a name: ");
            racer3 = scanner.next();
            racerThreeSpeed = random.nextInt(120)+1;
        }else {
            System.out.println("Something went wrong!");
        }if (answer4 == 1){
            vehicle4 = new Car();
            System.out.println("Give your racer a name: ");
            racer4 = scanner.next();
            racerFourSpeed = random.nextInt(180)+1;
        }else if (answer4 == 2){
            vehicle4 = new Bicycle();
            System.out.println("Give your racer a name: ");
            racer4 = scanner.next();
            racerFourSpeed = random.nextInt(80)+1;
        }else if (answer4 == 3){
            vehicle4 = new Plane();
            System.out.println("Give your racer a name: ");
            racer4 = scanner.next();
            racerFourSpeed = random.nextInt(1600)+1;
        }else if (answer4 ==4){
            vehicle4 = new Boat();
            System.out.println("Give your racer a name: ");
            racer4 = scanner.next();
            racerFourSpeed = random.nextInt(120)+1;
        }else {
            System.out.println("Something went wrong!");
        }

        System.out.println("Almost done! Enter distance: ");
        System.out.println("GO! GO! GO!");

        double distance = scanner.nextDouble();
        double racer1time = distance/racerOneSpeed;
        double racer2time = distance/racerTwoSpeed;
        double racer3time = distance/racerThreeSpeed;
        double racer4time = distance/racerFourSpeed;

        String fistPlace = "";
        String secondPlace = "";
        String thirdPlace = "";
        String forthPlace = "";

        if (racer1time<racer2time && racer1time<racer3time && racer1time<racer4time){
            fistPlace = racer1;
            if (racer2time<racer3time&&racer2time<racer4time){
                secondPlace=racer2;
                if (racer3time<racer4time){
                    thirdPlace = racer3;
                    forthPlace =racer4;
                }else{
                    thirdPlace = racer4;
                    forthPlace =racer3;
                }
            }else if (racer3time<racer2time&&racer3time<racer4time){
                secondPlace =racer3;
                if (racer2time<racer4time){
                    thirdPlace =racer2;
                    forthPlace = racer4;
                }else{
                    thirdPlace=racer4;
                    forthPlace=racer2;
                }
            }else if (racer4time<racer2time&racer4time<racer3time){
                secondPlace=racer4;
                if (racer2time<racer3time){
                    thirdPlace =racer2;
                    forthPlace = racer3;
                }else {
                    thirdPlace = racer3;
                    forthPlace =racer2;
                }
            }
        } else if (racer2time<racer1time && racer2time<racer3time && racer2time<racer4time){
            fistPlace = racer2;
            if (racer1time<racer3time&&racer1time<racer4time){
                secondPlace=racer1;
                if (racer3time<racer4time){
                    thirdPlace = racer3;
                    forthPlace =racer4;
                }else{
                    thirdPlace = racer4;
                    forthPlace =racer3;
                }
            }else if (racer3time<racer1time&&racer3time<racer4time){
                secondPlace =racer3;
                if (racer1time<racer4time){
                    thirdPlace =racer1;
                    forthPlace = racer4;
                }else{
                    thirdPlace=racer4;
                    forthPlace=racer1;
                }
            }else if (racer4time<racer1time&racer4time<racer3time){
                secondPlace=racer4;
                if (racer1time<racer3time){
                    thirdPlace =racer1;
                    forthPlace = racer3;
                }else {
                    thirdPlace = racer3;
                    forthPlace =racer1;
                }
            }
        }else if (racer3time<racer2time && racer3time<racer1time && racer3time<racer4time){
            fistPlace = racer3;
            if (racer2time<racer1time&&racer2time<racer4time){
                secondPlace=racer2;
                if (racer1time<racer4time){
                    thirdPlace = racer1;
                    forthPlace =racer4;
                }else{
                    thirdPlace = racer4;
                    forthPlace =racer1;
                }
            }else if (racer1time<racer2time&&racer1time<racer4time){
                secondPlace =racer1;
                if (racer2time<racer4time){
                    thirdPlace =racer2;
                    forthPlace = racer4;
                }else{
                    thirdPlace=racer4;
                    forthPlace=racer2;
                }
            }else if (racer4time<racer2time&racer4time<racer1time){
                secondPlace=racer4;
                if (racer2time<racer1time){
                    thirdPlace =racer2;
                    forthPlace = racer1;
                }else {
                    thirdPlace = racer1;
                    forthPlace =racer2;
                }
            }
        } else if (racer4time<racer2time && racer4time<racer3time && racer4time<racer1time){
            fistPlace = racer4;
            if (racer2time<racer3time&&racer2time<racer1time){
                secondPlace=racer2;
                if (racer3time<racer1time){
                    thirdPlace = racer3;
                    forthPlace =racer1;
                }else{
                    thirdPlace = racer1;
                    forthPlace =racer3;
                }
            }else if (racer3time<racer2time&&racer3time<racer1time){
                secondPlace =racer3;
                if (racer2time<racer1time){
                    thirdPlace =racer2;
                    forthPlace = racer1;
                }else{
                    thirdPlace=racer1;
                    forthPlace=racer2;
                }
            }else if (racer1time<racer2time&racer1time<racer3time){
                secondPlace=racer1;
                if (racer2time<racer3time){
                    thirdPlace =racer2;
                    forthPlace = racer3;
                }else {
                    thirdPlace = racer3;
                    forthPlace =racer2;
                }
            }
        }
        System.out.println("First place: " + fistPlace);
        System.out.println("Second place: " + secondPlace);
        System.out.println("Third place: " + thirdPlace);
        System.out.println("Forth place: " + forthPlace);
        System.out.println("--------------------------");
        System.out.println("Driver1: " + racer1 + " speed: " + racerOneSpeed + " time: " + racer1time);
        System.out.println("Driver2: " + racer2 + " speed: " + racerTwoSpeed + " time: " + racer2time);
        System.out.println("Driver3: " + racer3 + " speed: " + racerThreeSpeed + " time: " + racer3time);
        System.out.println("Driver4: " + racer4 + " speed: " + racerFourSpeed + " time: " + racer4time);
        }

    }

