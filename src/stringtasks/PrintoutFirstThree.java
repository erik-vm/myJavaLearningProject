package stringtasks;

import java.util.Scanner;

public class PrintoutFirstThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(front3(str));

        System.out.println(front3ByCodingBat(str));


    }

    //My solution
    static String front3(String str) {
        if (str == ""){
            str = "";
        }
       else if (str.length() < 2) {
            str = str.substring(0, 1);
        }
        else if (str.length()<3){
            str =str.substring(0,2);
        }
        else str = str.substring(0,3);
        return str+str+str;
    }

    //CodingBat solution
    static String front3ByCodingBat(String str){
        String front;
        if (str.length() >= 3){
            front = str.substring(0,3);
        }else front = str;
        return front+front+front;
    }
}
