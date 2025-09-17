// Superclass
class Book {
    String title;
    int publicationYear;

    Book(String title, int year) {
        this.title = title;
        this.publicationYear = year;
    }

    void displayInfo() {
        System.out.println("Book: " + title + ", Year: " + publicationYear);
    }
}

// Subclass
class Author extends Book {
    String name;
    String bio;

    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}

// Demo
public class LibraryDemo {
    public static void main(String[] args) {
        Author a1 = new Author("Java Programming", 2023, "Alice", "Expert in Java");
        a1.displayInfo();
    }
}
