import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;


    @Before
    public void before() {
        library = new Library("Langside", 5);
        book  = new Book("Spectacles", "Sue Perkins", "Biography");
    }

    @Test
    public void getName() {
        assertEquals("Langside", library.getName());
    }

    @Test
    public void getCapacity() {
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void libraryIsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBook() {
        library.add(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void libraryFull() {
        library.add(book);
        library.add(book);
        library.add(book);
        library.add(book);
        library.add(book);
        assertEquals(5, library.bookCount());
        library.add(book);
        assertEquals(5, library.bookCount());

    }
    // refactor using isFull and !isFull

    @Test
    public void canRemoveBook() {
        library.add(book);
        library.removeBook();
        assertEquals(0, library.bookCount());
    }

    @Test
    public void findAndRemoveBook() {
        library.add(book);
        Book foundBook = library.findAndRemoveBook("Spectacles");
        assertEquals(book, foundBook);
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canFindBooksByGenre() {
        library.add(book);
        library.add(book);
        library.add(book);
        ArrayList<Book> foundBooks = library.findByGenre("Biography");
        assertEquals(3, foundBooks.size());
    }


// test that the function countByGenre returns the number of books in that genre in the library

}
