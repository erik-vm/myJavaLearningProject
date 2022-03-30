import java.util.Scanner;

public class FirstAndLasNum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter integers. The highest and the lowest one will be added up. To stop, press 0!");

        int enteredNum = scanner.nextInt();
        int maxNum =enteredNum;
        int minNum = 0;

        do {
           if (enteredNum<maxNum){
               minNum = enteredNum;
           }else {
               maxNum = enteredNum;
           }
           enteredNum = scanner.nextInt();
        }while (enteredNum !=0);

        System.out.println(maxNum+minNum);

    }
}
