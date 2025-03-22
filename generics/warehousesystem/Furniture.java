package generics.warehousesystem;
// Class representing Furniture category
public class Furniture extends WarehouseItem {
    public Furniture(String name, double price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}
