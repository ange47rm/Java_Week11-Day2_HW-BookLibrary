import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("Learn To Code", "Eric Freeman", "Educational");
        book2 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        book3 = new Book("Harry Potter", "J.K. Rowling", "Fantasy");
        book4 = new Book("The Castle", "Franz Kafka", "Novel");
        borrower = new Borrower();
    }

    @Test
    public void collectionHasNoBooks(){
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void addBookToCollection(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
        borrower.takeBookFromLibrary(library, book2);
        assertEquals(1, borrower.collectionCount());
        assertEquals(1, library.bookCount());
    }
}
