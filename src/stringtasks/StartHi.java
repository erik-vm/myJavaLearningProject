package stringtasks;

import java.util.Scanner;

public class StartHi {
    public static void main(String[] args) {
        startHi("hi mate");
    }

    public static boolean startHi(String str) {
        if (str.length()<2){
            return false;
        }
return (str.charAt(0)=='h' && str.charAt(1)=='i');
    }


}
