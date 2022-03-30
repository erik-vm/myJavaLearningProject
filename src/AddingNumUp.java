import java.util.Scanner;

public class AddingNumUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers. They will be added up all together. To stop, press 0");
        int enteredNum = scanner.nextInt();
        int sum = enteredNum;

        do {
            System.out.println("Current sum: " + sum);
            enteredNum = scanner.nextInt();
            sum += enteredNum;
        }while (enteredNum != 0);

        System.out.println("Sum: " + sum);
    }
}
