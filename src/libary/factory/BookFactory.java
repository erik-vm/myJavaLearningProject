package libary.factory;

import libary.model.Book;

public class BookFactory {

    public Book createBook(long id, String author, String title){
        Book book = new Book();
        book.setId(id);
        book.setAuthor(author);
        book.setTitle(title);
        return book;
    }
}
