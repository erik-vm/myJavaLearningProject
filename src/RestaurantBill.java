import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. ask cost of the meal. 2.system calc tax +7% 3.and adds tip +15%  after tax 4.displays everything separate and total

        System.out.println("How much did the dish cost?");
        double dishCost = scanner.nextDouble();
        double tax = dishCost*0.07;
        double tip = (dishCost+tax)*0.15;
        double total = dishCost+tax+tip;

        System.out.printf("Dish: %.2f \nTax: %.2f \nTip: %.2f \nOverall: %.2f",   dishCost, tax, tip, total);
    }
}
