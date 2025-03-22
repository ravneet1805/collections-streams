package generics.warehousesystem;
import java.util.List;

public class WarehouseManagementSystem {
    public static void main(String[] args) {
        // Creating storage for different types of items
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Adding items
        electronicsStorage.addItem(new Electronics("Laptop", 1200.99));
        electronicsStorage.addItem(new Electronics("Smartphone", 899.49));

        groceriesStorage.addItem(new Groceries("Milk", 2.99));
        groceriesStorage.addItem(new Groceries("Bread", 1.99));

        furnitureStorage.addItem(new Furniture("Table", 150.75));
        furnitureStorage.addItem(new Furniture("Chair", 79.50));

        // Displaying items
        System.out.println("📌 Electronics in Storage:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("\n📌 Groceries in Storage:");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("\n📌 Furniture in Storage:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}
