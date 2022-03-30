package libary.model;

import libary.factory.BookFactory;
import libary.factory.PersonFactory;

import java.util.HashSet;
import java.util.Set;

public class Database {

    private Set<Person> personSet;
    private Set<Book> bookSet;
    private PersonFactory personFactory = new PersonFactory();
    private BookFactory bookFactory = new BookFactory();

public Database(){
    personSet = new HashSet<>();
    bookSet = new HashSet<>();

    Person person1 = personFactory.createPerson(1,"Paul");
    Person person2 = personFactory.createPerson(2,"Mary");
    Person person3 = personFactory.createPerson(3,"John");

    personSet.add(person1);
    personSet.add(person2);
    personSet.add(person3);

    Book book1 = bookFactory.createBook(1, "Luts", "Kevade");
    Book book2 = bookFactory.createBook(2, "Tammasaare", "T6de ja 6igus");
    Book book3 = bookFactory.createBook(3, "Kreuzwald", "Kalevipoeg");

    bookSet.add(book1);
    bookSet.add(book2);
    bookSet.add(book3);

}
public Person getPersonById(long id){
    for (Person person: personSet) {
        if(person.getId() == id){
            return person;
        }

    }
    throw new RuntimeException("Person with id "  + id + " was not found.");
}
public Book getBookById(long id){
    for(Book book : bookSet){
        if (book.getId() == id){
            return book;
        }
    }
    throw new RuntimeException("Book with id " + id + " was not found.");
}

    public Set<Person> getPersonSet() {
        return personSet;
    }

    public void setPersonSet(Set<Person> personSet) {
        this.personSet = personSet;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public PersonFactory getPersonFactory() {
        return personFactory;
    }

    public void setPersonFactory(PersonFactory personFactory) {
        this.personFactory = personFactory;
    }

    public BookFactory getBookFactory() {
        return bookFactory;
    }

    public void setBookFactory(BookFactory bookFactory) {
        this.bookFactory = bookFactory;
    }
}
