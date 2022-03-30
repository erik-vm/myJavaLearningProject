package groceryList2.services;

import groceryList2.model.Database;
import groceryList2.model.Product;

import java.util.Set;

public class ReportService {

    Database database;

    public ReportService(Database database) {
        this.database = database;
    }

   public Set<Product> showAllProducts(){
        return database.getProductSet();
   }
}
