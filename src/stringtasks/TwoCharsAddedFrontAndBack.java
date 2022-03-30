package stringtasks;

import java.util.Scanner;

public class TwoCharsAddedFrontAndBack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(front22(str));
    }

    public static String front22(String str) {
        String twoChars;
        if (str.length()>=2){
            twoChars = str.substring(0,2);
        }else {
            twoChars = str;
        }
return twoChars+str+twoChars;
    }

}
