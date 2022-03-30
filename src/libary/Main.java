package libary;

import libary.model.Book;
import libary.model.Database;
import libary.model.Person;
import libary.service.BookLendingService;
import libary.service.ReportService;

public class Main {
    public static void main(String[] args) {

        Database database = new Database();
        ReportService reportService = new ReportService(database);
        BookLendingService bookLendingService = new BookLendingService();

        Person person = database.getPersonById(1);
        Book book = database.getBookById(2);
        bookLendingService.reserveBook(book,person);


        System.out.println(reportService.showReservedBooks());
        System.out.println(reportService.displayAllBooks());




    }
}
