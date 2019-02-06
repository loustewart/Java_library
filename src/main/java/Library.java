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

    public Book findAndRemoveBook(String title) {
        //loop through the books and return if the title is the same as the search
        //us enhanced loop
        for(Book book : this.books) {
            if (book.getTitle() .equals(title) ){
                int index = this.books.indexOf(book);
                return this.books.remove(index);
            }
        }
        return null;
    }


    public ArrayList<Book> findByGenre(String genre) {
        ArrayList<Book> foundBooks = new ArrayList<Book>();
        for(Book book : this.books) {
            if (book.getGenre() .equals(genre)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}





// count the number of books in the library with a specified genre
