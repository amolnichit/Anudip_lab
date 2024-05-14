package java_APK;

import java.util.*;

class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        this.setBooks(new ArrayList<>());
        this.users = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book newBook = new Book(title, author);
        getBooks().add(newBook);
        System.out.println("Book added to the library: " + newBook);
    }

    public void addUser(String name, int userId) {
        User newUser = new User(name, userId);
        users.add(newUser);
        System.out.println("User added to the library: " + newUser);
    }

    public void displayBooks() {
        if (getBooks().isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Library Books:");
            for (Book book : getBooks()) {
                System.out.println(book);
            }
        }
    }

    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("No users in the library.");
        } else {
            System.out.println("Library Users:");
            for (User user : users) {
                System.out.println(user);
            }
        }
    }

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
