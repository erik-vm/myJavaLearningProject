package stringtasks;

import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.nextLine();
        System.out.println("Enter index of the word");
        int index = scanner.nextInt();

        String front = word.substring(0,index);
        String back = word.substring(index+1, word.length());

        System.out.println(front+back);
    }
}
