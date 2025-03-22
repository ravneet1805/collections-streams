package generics.marketplace;



public class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price, "Clothing");
    }

    @Override
    public void display() {
        System.out.println("Clothing: " + name + " | Price: $" + price);
    }
}
