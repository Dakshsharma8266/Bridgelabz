import java.util.ArrayList;

// Book class
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}

// Library class
class Library {
    String name;
    ArrayList<Book> books; // Aggregation

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();
        }
    }
}

// Demo
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Author A");
        Book b2 = new Book("Data Structures", "Author B");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2); // same book can exist in multiple libraries

        lib1.showBooks();
        lib2.showBooks();
    }
}
Library
---------------
- name: String
- books: ArrayList<Book>
---------------
+ addBook(Book)
+ showBooks()

Book
---------------
- title: String
- author: String
---------------
+ display()
