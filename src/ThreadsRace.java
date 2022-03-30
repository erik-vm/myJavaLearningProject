import java.util.Random;
import java.util.Scanner;

class Runner implements Runnable{
Scanner scanner = new Scanner(System.in);

    private String name;
    private double raceTime;
    Random random = new Random();
    int number;

    Runner(String name){
        this.name = name;
    }

    public double getRaceTime() {
        return raceTime;
    }

    @Override
    public void run() {
        double startTime = System.currentTimeMillis();
        for (int i = 1; i <= number; i++){
            try {
                Thread.sleep(random.nextInt(1000));
                System.out.print(i + " ");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        double endTime = System.currentTimeMillis();
        System.out.println();
        raceTime = (endTime-startTime)/1000;
        System.out.printf("Finished distance with time: %.2f seconds ", raceTime);
    }
}

class ThreadsRace{

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Enter 4 racers names");
        String r1Name = scanner.nextLine();
        String r2Name = scanner.nextLine();
        String r3Name = scanner.nextLine();
        String r4Name = scanner.nextLine();

       Runner runner1 = new Runner(r1Name);
       Runner runner2 = new Runner(r2Name);
       Runner runner3 = new Runner(r3Name);
       Runner runner4 = new Runner(r4Name);

        System.out.println("Enter distance: ");

        System.out.println("Press enter to start the race!");
        String enter = scanner.nextLine();

        runner1.run();
        runner2.run();
        runner3.run();
        runner4.run();

    }

    protected int distance(){
        
        return scanner.nextInt();
    }
}
