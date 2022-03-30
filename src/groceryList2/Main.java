package groceryList2;

import groceryList2.model.Database;
import groceryList2.services.ReportService;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        ReportService reportService = new ReportService(database);

        System.out.println(reportService.showAllProducts());
    }
}
