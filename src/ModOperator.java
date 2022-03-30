import java.util.Scanner;

public class ModOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.println(or35(num));
    }


    //Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator

    public static boolean or35(int n) {
return  (n % 3 == 0 || n % 5 == 0);
    }
}
