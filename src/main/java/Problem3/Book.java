package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        // homework
        id = anotherBook.id;
        title = anotherBook.title;
        author = anotherBook.author;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        if (!(obj instanceof Book)) {
            return false;
        }
        Book otherBook = (Book)obj;
        if (id == otherBook.id) {
            return true;
        } else {
            return false;
        }
    }
}
