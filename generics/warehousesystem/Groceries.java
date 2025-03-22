package generics.warehousesystem;
// Class representing Groceries category
public class Groceries extends WarehouseItem {
    public Groceries(String name, double price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}
