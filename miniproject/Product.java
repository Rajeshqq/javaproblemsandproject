package miniproject;

public class Product {
    private String name;
    private int stockLevel;

    public Product(String name, int stockLevel) {
        this.name = name;
        this.stockLevel = stockLevel;
    }

    public String getName() {
        return name;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void addStock(int quantity) {
        stockLevel += quantity;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    @Override
    public String toString() {
        return name + ": " + stockLevel;
    }
}
