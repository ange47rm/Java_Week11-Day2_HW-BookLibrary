import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before() {
        library = new Library(3);
        book1 = new Book("Learn To Code", "Eric Freeman", "Educational");
        book2 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        book3 = new Book("Harry Potter", "J.K. Rowling", "Fantasy");
        book4 = new Book("The Castle", "Franz Kafka", "Novel");
    }

    @Test
        public void canAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
        public void cannotAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.bookCount());
    }
}