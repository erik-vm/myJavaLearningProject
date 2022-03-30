package GroceryList;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryList groceryList = new GroceryList();

        boolean quit = false;
        groceryList.printInstructions();
        int choice = 0;

       while (!quit){
           choice = scanner.nextInt();
           scanner.nextLine();
           switch (choice){
               case 0: groceryList.printInstructions();
                   break;
               case 1: groceryList.printList();
                   break;
               case 2: groceryList.addItem();
                   break;
               case 3: groceryList.modifyItem();
                   break;
               case 4: groceryList.removeItem();
                   break;
               case 5: groceryList.searchItem();
                   break;
               case 6 : quit = true;
                   break;
               default:
                   System.out.println("Enter number from 0 - 6");
           }
       }
    }
}