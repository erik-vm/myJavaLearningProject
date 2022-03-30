public class CloseToTen {
    public static void main(String[] args) {


        System.out.println(  close10(7,13));
    }

    public static int close10(int a, int b){
        if (Math.abs(10- a) < Math.abs(10-b)){
            return a;
        }
        if  (Math.abs(10- a) > Math.abs(10- b)){
            return b;
        }
        return 0;
    }
}
