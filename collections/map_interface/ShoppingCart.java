package map_interface;

import java.util.*;

public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private LinkedHashMap<String, Double> cart = new LinkedHashMap<>();
    private TreeMap<Double, String> sortedCart = new TreeMap<>();

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    public void addToCart(String product) {
        if (productPrices.containsKey(product)) {
            double price = productPrices.get(product);
            cart.put(product, price);
            sortedCart.put(price, product);
        }
    }

    public void displayCart() {
        System.out.println("Cart Items: " + cart);
        System.out.println("Sorted by Price: " + sortedCart);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Laptop", 1200);
        cart.addProduct("Phone", 800);
        cart.addProduct("Mouse", 25);

        cart.addToCart("Phone");
        cart.addToCart("Laptop");
        cart.addToCart("Mouse");

        cart.displayCart();
    }
}
