public class SameLastDigits {
    public static void main(String[] args) {

        System.out.println(lastDigit(1244, 4));

        String str = "Midaiganes";

        System.out.println(str.substring(0,str.length()-3)+str.toUpperCase().substring(str.length()-3, str.length()));

    }
    public static boolean lastDigit(int a, int b) {
        return (a%10 == b%10);
    }
}
