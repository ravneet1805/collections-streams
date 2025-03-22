package generics.marketplace;


public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        // Create catalog for different product types
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();

        // Add products
        Book book1 = new Book("The Alchemist", 20.99);
        Book book2 = new Book("1984", 15.50);
        bookCatalog.addProduct(book1);
        bookCatalog.addProduct(book2);

        Clothing cloth1 = new Clothing("T-Shirt", 10.99);
        Clothing cloth2 = new Clothing("Jeans", 25.99);
        clothingCatalog.addProduct(cloth1);
        clothingCatalog.addProduct(cloth2);

        Gadget gadget1 = new Gadget("Smartphone", 499.99);
        Gadget gadget2 = new Gadget("Headphones", 59.99);
        gadgetCatalog.addProduct(gadget1);
        gadgetCatalog.addProduct(gadget2);

        // Display all products
        System.out.println("Books:");
        bookCatalog.displayProducts();

        System.out.println("\nClothing:");
        clothingCatalog.displayProducts();

        System.out.println("\nGadgets:");
        gadgetCatalog.displayProducts();

        // Apply discounts dynamically
        System.out.println("\nApplying Discounts:");
        ProductCatalog.applyDiscount(book1, 10);
        ProductCatalog.applyDiscount(cloth1, 15);
        ProductCatalog.applyDiscount(gadget1, 5);

        // Display updated products after discount
        System.out.println("\nUpdated Products:");
        bookCatalog.displayProducts();
        clothingCatalog.displayProducts();
        gadgetCatalog.displayProducts();
    }
}
