package generics.marketplace;



public class Gadget extends Product {
    public Gadget(String name, double price) {
        super(name, price, "Gadgets");
    }

    @Override
    public void display() {
        System.out.println("Gadget: " + name + " | Price: $" + price);
    }
}
