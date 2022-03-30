package advancedCodingFeatures.com;


import advancedCodingFeatures.com.shoppingApp.factory.ProductFactory;
import advancedCodingFeatures.com.shoppingApp.mode.Database;
import advancedCodingFeatures.com.shoppingApp.mode.Product;
import advancedCodingFeatures.com.shoppingApp.services.ReportService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String str = scanner.nextLine();

        if (str.length() <3){
            System.out.println(str.toUpperCase(Locale.ROOT));
        }else{
            System.out.println(str.substring(0,str.length()-3)+str.substring(str.length()-3, str.length()).toUpperCase(Locale.ROOT));
        }

    }
}
