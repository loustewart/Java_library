import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> books;

    public Borrower (String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int numberOfBooks() {
        return this.books.size();
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public void remove(Book book) {
        this.books.remove(0);
    }


    public void borrowBookFromLibrary(Library library, String title) {
        Book foundBook = library.findAndRemoveBook(title);
        add(foundBook);
    }
}
