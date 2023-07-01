package miniproject;

public class Inventory extends Exception {
    private Product[] products;
    private int numProducts;

    public Inventory() {
        products = new Product[1];
        numProducts = 0;
    }
    public void addProduct(String name, int stockLevel) {
        // Create a new Product object with the given name and stock level
        Product newProduct = new Product(name, stockLevel);

        // Check if the products array is full
        if (numProducts == products.length) {
            // If it is full, create a new, larger array and copy the existing elements over
            Product[] newProducts = new Product[products.length * 2];
            System.arraycopy(products, 0, newProducts, 0, products.length);
            products = newProducts;
        }

        // Add the new Product object to the products array
        products[numProducts] = newProduct;
        numProducts++;

        System.out.println("Added new product: " + newProduct.getName());
    }

    public void addStock(String name, int quantity) {
       try{ for (Product p : products) {
            if (p.getName().equals(name)) {
                p.addStock(quantity);
                System.out.println("Added " + quantity + " to product " + name + " stock level");
                return;
            }
        }
        System.out.println("Product " + name + " not found in inventory");
    }
    catch(Exception e)
    {
        System.out.println(e+"stock is empty");
    }
    }

    public void updateStock(String name, int stockLevel) {
      try{  for (Product p : products) {
            if (p.getName().equals(name)) {
                p.setStockLevel(stockLevel);
                System.out.println("Product " + name + " updated with stock level " + stockLevel);
                return;
            }
        }
        System.out.println("Product " + name + " not found in inventory");
    }
    catch(Exception e)
    {
        System.out.println(e+"stock is empty");
    }
        
    }

    public void displayInventory() {
        try{System.out.println("Inventory:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
    catch(Exception e)
    {
        System.out.println(e+"stock is empty");
    }
    }
    public void deliveredStock(String name, int quantity) {
       try{ for (Product p : products) {
            if (p.getName().equals(name)) {
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
    catch(Exception e)
    {
        System.out.println(e+"stock is empty");
    }
    }
    
}

