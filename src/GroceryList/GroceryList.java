package GroceryList;

//TODO:
//1. addItem
//2. printList
//3. removeItem
//4. modifyItem
//5. findItem  isInList


import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class GroceryList {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<String> groceryList = new ArrayList<>();

    public void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");

    }

    public void addItem() {
        System.out.println("Enter items name:");
        String item = scanner.nextLine();
        groceryList.add(item);
        System.out.println(item + " has been added to the list. You have currently " + groceryList.size() + " item in your list.");
        System.out.println("------------------------------------------------------------------------------");
    }

    public void printList() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ")" + groceryList.get(i));
        }
        System.out.println("------------------------------------------------------------------------------");
    }

    public void removeItem() {
        System.out.println("Enter item to remove:");
        String item = scanner.nextLine();
        int position = getIndex(item);
        if (position >= 0){
            groceryList.remove(position);
        }
    }

    public void modifyItem() {
        System.out.println("Enter index of and item to modify: ");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new item:");
        String item = scanner.nextLine();
        groceryList.set(position, item);
        System.out.println("Item has been updated.");
        System.out.println("------------------------------------------------------------------------------");
    }

    public void searchItem() {
        System.out.println("Enter a name of an item to look for:");
        String iem = scanner.nextLine();
        ;
        if (isInList(iem)) {
            System.out.println("Item is in list");
        } else {
            System.out.println("Item not found");
        }
        System.out.println("------------------------------------------------------------------------------");
    }

    private int getIndex(String item) {
        return groceryList.indexOf(item);
    }

    private boolean isInList(String item) {
        int position = getIndex(item);
        if (position >= 0) {
            return true;
        }
        return false;
    }

}
