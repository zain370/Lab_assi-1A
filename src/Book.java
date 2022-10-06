public class Book {
    private String ISBN;
    private String title;
    private Person author;
    private double price;
    private int quantity;

    public Book(String ISBN, String title, Person author, float price, int quantity) {
        this.ISBN = ISBN;
        this.title = title;
        this.author=author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString(){
        return String.format("%10s %20s %10s %5.2f %5d",ISBN,title,author,price,quantity);
    }
}
