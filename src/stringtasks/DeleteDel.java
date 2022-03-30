package stringtasks;

public class DeleteDel {
    public static void main(String[] args) {

        System.out.println(delDel("iidelli"));
String str = "";


    }

    static String delDel(String str){
        if (str.length()<=3){
            return str;
        }
        if (!str.substring(1,4).equals("del")){
            return str;
        }
        return str.replace("del","");
    }

    public String delDel2(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            // First char + rest of string starting at 4
            return str.substring(0, 1) + str.substring(4);
        }
        // Otherwise return the original string.
        return str;
    }
}
