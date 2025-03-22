package generics.marketplace;



public class Book extends Product {
    public Book(String name, double price) {
        super(name, price, "Books");
    }

    @Override
    public void display() {
        System.out.println("Book: " + name + " | Price: $" + price);
    }
}
