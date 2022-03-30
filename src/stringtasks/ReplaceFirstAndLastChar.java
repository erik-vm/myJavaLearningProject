package stringtasks;

import java.util.Scanner;

public class ReplaceFirstAndLastChar {
    public static String main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.nextLine();

        //Using method that created string to an array of chars

        /*char[] ch = word.toCharArray();
        char temp = ch[0];
        ch[0] = ch[ch.length-1];
        ch[ch.length-1] = temp;
        System.out.println(ch);*/

        //CodingBat solution

        if (word.length()<=1)
            return word;

        String middle = word.substring(1, word.length()-1);
        System.out.println(word.charAt(word.length()-1)+middle+word.charAt(0));

        return word;
    }
}
