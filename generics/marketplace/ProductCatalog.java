package generics.marketplace;


import java.util.ArrayList;
import java.util.List;

public class ProductCatalog<T extends Product> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public void displayProducts() {
        for (T product : products) {
            product.display();
        }
    }

    public static <T extends Product> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
        System.out.println("Discount applied! New price of " + product.getName() + " is $" + product.getPrice());
    }
}

