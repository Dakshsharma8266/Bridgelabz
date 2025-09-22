import java.util.*;

// Custom Exception
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Book {
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void checkout() throws BookNotAvailableException {
        if (!isAvailable) {
            throw new BookNotAvailableException("Book '" + title + "' is not available!");
        }
        isAvailable = false;
        System.out.println("Checked out: " + title);
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Returned: " + title);
    }

    @Override
    public String toString() {
        return title + " by " + author + " [" + (isAvailable ? "Available" : "Checked out") + "]";
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", "James Gosling"));
        books.add(new Book("Data Structures", "Mark Allen"));
        books.add(new Book("Operating Systems", "Silberschatz"));

        // Search by partial title
        String search = "Java";
        System.out.println("\nSearch results for: " + search);
        for (Book b : books) {
            if (b.title.toLowerCase().contains(search.toLowerCase())) {
                System.out.println(b);
            }
        }

        // Checkout & Exception Handling
        try {
            books.get(0).checkout();
            books.get(0).checkout(); // Trying again → throws exception
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Return book
        books.get(0).returnBook();

        // Display all books
        System.out.println("\nLibrary Books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
