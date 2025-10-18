//77
class Book {
    private String title;
    private String author;
    private double price;
    private int stock;

    // Parameterized constructor
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Copy constructor
    public Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
        this.stock = b.stock;
    }

    // Method to sell books
    public void sellBook(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            double totalPrice = quantity * price;
            System.out.println(quantity + " book(s) sold. Total Price: " + totalPrice);
        } else {
            System.out.println("Not enough stock to sell " + quantity + " book(s).");
        }
    }

    // Method to restock books
    public void restockBook(int quantity) {
        stock += quantity;
        System.out.println(quantity + " book(s) added. Current Stock: " + stock);
    }

    // Display book details
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Stock: " + stock);
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "John Doe", 500, 10);
        b1.display();

        Book b2 = new Book(b1); // Clone using copy constructor
        b2.display();

        b1.sellBook(3);
        b1.restockBook(5);
        b1.display();
    }
}
