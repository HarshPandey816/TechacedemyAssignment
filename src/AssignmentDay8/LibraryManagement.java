package AssignmentDay8;

import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book b = (Book) o;
        return title.equals(b.title) && author.equals(b.author);
    }

    public int hashCode() {
        return Objects.hash(title, author);
    }

    public String toString() {
        return title + " by " + author;
    }
}

class LibraryManagement {
    public static void main(String[] args) {

        HashMap<Book, Boolean> library = new HashMap<>();

        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("Python Guide", "Guido");
        Book b3 = new Book("DSA", "Mark");

        library.put(b1, true);
        library.put(b2, false);
        library.put(b3, true);

        for (Map.Entry<Book, Boolean> entry : library.entrySet()) {
            System.out.println(entry.getKey() + " Available: " + entry.getValue());
        }
    }
}