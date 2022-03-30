package advancedCodingFeatures.com.shoppingApp.services;

import advancedCodingFeatures.com.shoppingApp.mode.Database;
import advancedCodingFeatures.com.shoppingApp.mode.Product;

import java.util.Set;

public class ReportService {
    Database database;

    public ReportService(Database database) {
        this.database = database;
    }

    public Set<Product> showAllProducts() {
        return database.getProducts();
    }
}
