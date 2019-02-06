import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower("Bob");
        book = new Book("Spectacles", "Sue Perkins", "Biography");
        library = new Library("Langside", 5);
        library.add(book);
    }

    @Test
    public void getName() {
        assertEquals("Bob", borrower.getName());
    }

    @Test
    public void startsWithNoBooks() {
        assertEquals(0, borrower.numberOfBooks());
    }

    @Test
    public void addBook() {
        borrower.add(book);
        assertEquals(1, borrower.numberOfBooks());
    }

    @Test
    public void removeBook() {
        borrower.add(book);
        borrower.add(book);
        borrower.add(book);
        assertEquals(3, borrower.numberOfBooks());
        borrower.remove(book);
        assertEquals(2, borrower.numberOfBooks());
    }

    @Test
    public void canBorrowFromLibrary() {
        borrower.borrowBookFromLibrary(library, "Spectacles");
        assertEquals(1, borrower.numberOfBooks());
        assertEquals(0, library.bookCount());
    }
}
