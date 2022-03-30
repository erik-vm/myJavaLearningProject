import java.util.Scanner;

public class BankBalance {

    private static Scanner scanner = new Scanner(System.in);
    private static double balance = 0;
    public static void main(String[] args) {

        System.out.println("Welcome to ATM.");
        options();
        boolean exit = false;
        while (!exit){
            int response = scanner.nextInt();
            scanner.nextLine();
            switch (response){
                case 0 : options();
                break;
                case 1 : checkBalance();
                break;
                case 2: deposit();
                break;
                case 3 : withdrawal();
                break;
                case 4 : exit = true;
                break;
                default:
                    System.out.println("Please enter number from 0-4");
            }
        }

    }
    public static void options(){
        System.out.println("Please choose option to continue: \n\t0 - Show options\n\t1 - Check balance\n\t2 - Deposit\n\t3 - Withdrawal\n\t4 - Exit");
    }
    public static void checkBalance(){
        System.out.println("Your current balance: " + balance);
    }
    public static void deposit(){
        System.out.println("Enter the amount you want to deposit: ");
        double deposit = scanner.nextDouble();
        balance+=deposit;
        System.out.println(deposit + " has been added to account.\n\tBalance: " + balance);
    }
    public static void withdrawal(){
        System.out.println("Enter the amount to withdrawal:");
        double withdrawal = scanner.nextDouble();
        if (balance-withdrawal<0){
            System.out.println("Balance cant go below 0.");
            return;
        }else {
            balance-=withdrawal;
            System.out.println(withdrawal + " has been withdrawn from account.\n\tBalance: " + balance);
        }
    }

}
