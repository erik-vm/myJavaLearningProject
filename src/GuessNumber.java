import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range:");
        int range = scanner.nextInt();
        System.out.println("How many tries:");
        int tries = scanner.nextInt()-1;
        int computerNum = (int) (Math.random() * (range+1));
        System.out.println("Please enter number between 1-"+range);
        int userNum = scanner.nextInt();
        int count = 1;

        while(userNum != computerNum){
            if (tries == 0){
                System.out.println("Sorry! You out of tries.");
                System.out.println("Correct number was: " + computerNum);
                return;
            }else{
                if (userNum>computerNum){
                    System.out.println("Try lower");
                    System.out.println("You have " + tries + " tries left.");
                }else if(userNum<computerNum){
                    System.out.println("Try higher");
                    System.out.println("You have " + tries + " tries left.");
                }
                userNum = scanner.nextInt();
                count++;
                tries--;
            }
        }
        System.out.println("It took you " + count + " tries.");
    }

}
