package lab9;

class Book {
    static String libraryName = "MyLibrary"; // Static attribute

    int bookId;
    String bookName;
    double bookPrice;
    String authorName;
    boolean availability;
    Book nextBook;

    public Book(int bookId, String bookName, double bookPrice, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
        this.availability = true;
        this.nextBook = null;
    }
}

class BookManagementSystem {
    Book head;

    public void createBook(int bookId, String bookName, double bookPrice, String authorName) {
        Book newBook = new Book(bookId, bookName, bookPrice, authorName);
        if (head == null) {
            head = newBook;
        } else {
            Book currentBook = head;
            while (currentBook.nextBook != null) {
                currentBook = currentBook.nextBook;
            }
            currentBook.nextBook = newBook;
        }
    }

    public void deleteBook(int bookId) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        if (head.bookId == bookId) {
            head = head.nextBook;
            System.out.println("Book deleted successfully.");
            return;
        }
        Book prevBook = head;
        Book currentBook = head.nextBook;
        while (currentBook != null) {
            if (currentBook.bookId == bookId) {
                prevBook.nextBook = currentBook.nextBook;
                System.out.println("Book deleted successfully.");
                return;
            }
            prevBook = currentBook;
            currentBook = currentBook.nextBook;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    public void displayBooks() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        Book currentBook = head;
        System.out.println("Book ID\tBook Name\tPrice\tAuthor\tAvailability");
        while (currentBook != null) {
            System.out.println(currentBook.bookId + "\t" + currentBook.bookName + "\t" +
                    currentBook.bookPrice + "\t" + currentBook.authorName + "\t" +
                    (currentBook.availability ? "Available" : "Not Available"));
            currentBook = currentBook.nextBook;
        }
    }
}

public class Que3 {
    public static void main(String[] args) {
        BookManagementSystem bms = new BookManagementSystem();

        // Adding books
        bms.createBook(101, "Python Programming", 25.99, "John Smith");
        bms.createBook(102, "Data Structures and Algorithms", 35.99, "Alice Johnson");
        bms.createBook(103, "Machine Learning Basics", 45.99, "David Miller");

        // Display all books
        System.out.println("All Books in the Library:");
        bms.displayBooks();

        // Delete a book
        bms.deleteBook(102);

        // Display all books after deletion
        System.out.println("\nAll Books in the Library after deletion:");
        bms.displayBooks();
    }
}
