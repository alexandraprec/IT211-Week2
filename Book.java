import java.util.ArrayList;

public class Book {
    // Attribute of Book Class
    private String title;
    private String author;
    private String isbn;

    // Constructor to initialize the book object
    public Book(String title, String author, String isbn){
        this.title = title; // Set the title attribute using this
        this.author = author; // Set the author attribute using this
        this.isbn = isbn; // Set the isbn attribute using this
    }

    // Getter method for the title attribute
    public String getTitle() {
        return title;
    }

    // Getter method for the author attribute
    public String getAuthor() {
        return author;
    }

    // Getter method for the isbn attribute
    public String getIsbn() {
        return isbn;
    }

    // Method to return a string representation of the book object
    @Override
    public String toString(){
        return "Title: " + title + ", Author: " + author +  ", ISBN: " + isbn;
    }

    // Class to manage a collection of books
    public static class BookCollection {
        private ArrayList<Book> books;

        // Constructor to initialize the BookCollection object
        public BookCollection() {
            books = new ArrayList<>(); // Initialize the Arraylist to store books
        }

        // Method to add a book to the collection
        public void addBook(Book book) {
            books.add(book);
            System.out.println("Book added: " + book);
        }

        // Method to remove a book from the collection
        public void removeBookByIsbn(String isbn){
            for(Book book: books){
               if(book.getIsbn().equals(isbn)) {
                   books.remove(book);
                   System.out.println("Book removed: " + book);
                   return;
                }
            }
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
        // Method to display book in the collection
        public void displayBooks(){
            System.out.println("Book Collection: ");
            for (Book book : books){
                System.out.println(book);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of the BookCollection class
        BookCollection collection = new BookCollection();
        // Create and add books to the collection
        Book book1 = new Book("The Cat in the Hat", "Dr. Seuss", "1234567890");
        Book book2 = new Book ("Dune", "Frank Herbert", "1234567891");
        collection.addBook(book1);
        collection.addBook(book2);

        // Display all books in the collection
        collection.displayBooks();

        // Remove the book by ISBN
        collection.removeBookByIsbn("1234567890");

        // Display all the books in the collection after removal
        collection.displayBooks();

    }
}
