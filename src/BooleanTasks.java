public class BooleanTasks {
    public static void main(String[] args) {

        System.out.println(loneTeen(99,99));
    }
    public boolean icyHot(int temp1, int temp2) {
        return (temp1<0 && temp2>100 || temp1>100 && temp2<0);
    }

    public boolean in1020(int a, int b) {
        return ((a>=10&&a<=20) || (b>=10&&b<=20));
    }

    public  static boolean loneTeen(int a, int b) {
        boolean aTeen = ((a>=13&&a<=19)&&(b<13||b>19));
        boolean bTeen = ((b>=13&&b<=19)&&(a<13||a>19));
        return (aTeen&&!bTeen)||(!aTeen&&bTeen);
    }

    public static boolean mixStart(String str) {
        if (str.length()<3)
            return false;
return (str.substring(1,3).equals("ix"));
    }

}
