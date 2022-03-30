package stringtasks;

import java.util.Scanner;

public class BackAndFront {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(backAround(str));

        System.out.println();
    }

    public static String backAround(String str) {
char lastChar = str.charAt(str.length()-1);
return lastChar+str+lastChar;
    }
}
