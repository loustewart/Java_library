import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> books;

    public Library (String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void add(Book book) {
        if(this.books.size() < getCapacity()) {
            this.books.add(book);
        }
    }

    public Book removeBook() {
        return this.books.remove(0);
    }


    // count the number of books in the library with a specified genre
}
