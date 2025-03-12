// Inventory.java
package miniproject;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, int stockLevel) {
        products.add(new Product(name, stockLevel));
        System.out.println("Added new product: " + name);
    }

    public void addStock(String name, int quantity) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.addStock(quantity);
                System.out.println("Added " + quantity + " to product " + name + " stock level");
                return;
            }
        }
        System.out.println("Product " + name + " not found in inventory");
    }

    public void updateStock(String name, int stockLevel) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                
                p.setStockLevel(stockLevel);
                System.out.println("Product " + name + " updated with stock level " + stockLevel);
                return;
            }
        }
        System.out.println("Product " + name + " not found in inventory");
    }

    public void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Inventory:");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void deliveredStock(String name, int quantity) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                if (p.getStockLevel() >= quantity) {
                    p.setStockLevel(p.getStockLevel() - quantity);
                    System.out.println("Product " + name + " stock level updated after delivery: " + p.getStockLevel());
                } else {
                    System.out.println("Not enough stock for product " + name + " to fulfill delivery");
                }
                return;
            }
        }
        System.out.println("Product " + name + " not found in inventory");
    }
}