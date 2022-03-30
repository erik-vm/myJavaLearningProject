package libary.service;

import libary.model.Book;
import libary.model.Database;

import java.util.HashSet;
import java.util.Set;

public class ReportService {

    private Database database;

    public ReportService(Database database) {
        this.database = database;
    }

    public Set<Book> displayAllBooks() {
        return database.getBookSet();
    }

    public Set<Book> showAvailableBooks() {
        Set<Book> allBooks = database.getBookSet();
        Set<Book> availableBooks = new HashSet<>();

        for (Book book : allBooks) {
            if (book.getPerson() == null) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public Set<Book> showReservedBooks(){
        Set<Book> allBooks = database.getBookSet();
        Set<Book> reservedBooks = new HashSet<>();

        for (Book book : allBooks){
            if (book.getPerson() != null){
                reservedBooks.add(book);
            }
        }
        return reservedBooks;
    }
}
