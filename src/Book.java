public class Book  {
    private String name;
    private int price;
    private int quantity;
    private String author;


    public Book() {
    }
    public Book(String name, int price, int quantity, String author) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", author='" + author + '\'' +
                '}';
    }
}
