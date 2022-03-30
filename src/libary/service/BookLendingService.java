package libary.service;

import libary.model.Book;
import libary.model.Person;

import java.util.Date;

public class BookLendingService {

    public static final int TWO_WEEKS = 1000 * 3600 * 24 * 14;

    public void reserveBook(Book book, Person person) {
        if (book.getPerson() != null) {
            throw new RuntimeException("Book is already reserved");
        }
        book.setPerson(person);
        book.setUntil(new Date(System.currentTimeMillis() + TWO_WEEKS));
    }

    public void returnBook(Book book){
        book.setPerson(null);
        book.setUntil(null);
    }
}
