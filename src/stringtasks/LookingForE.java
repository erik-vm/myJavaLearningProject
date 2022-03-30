package stringtasks;

public class LookingForE {
    public static void main(String[] args) {

        System.out.println(StringE("Hll"));

    }

    public static boolean StringE(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                counter++;
            }
        }
        return (counter > 0 && counter <= 3);

    }
}