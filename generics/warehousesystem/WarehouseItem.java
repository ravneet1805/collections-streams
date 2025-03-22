package generics.warehousesystem;

// Abstract class representing a general warehouse item
public abstract class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getCategory();

    @Override
    public String toString() {
        return getCategory() + ": " + name + " ($" + price + ")";
    }
}
