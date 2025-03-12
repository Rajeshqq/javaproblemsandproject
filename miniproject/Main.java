package miniproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("Enter command (add, addStock, update, display, deliver, exit):");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "add":
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter stock level: ");
                    int stockLevel = scanner.nextInt();
                    scanner.nextLine();
                    inventory.addProduct(name, stockLevel);
                    break;

                case "addstock":
                    System.out.print("Enter product name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter quantity to add: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    inventory.addStock(name, quantity);
                    break;

                case "update":
                    System.out.print("Enter product name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new stock level: ");
                    stockLevel = scanner.nextInt();
                    scanner.nextLine();
                    inventory.updateStock(name, stockLevel);
                    break;

                case "display":
                    inventory.displayInventory();
                    break;

                case "deliver":
                    System.out.print("Enter product name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter quantity to deliver: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    inventory.deliveredStock(name, quantity);
                    break;

                case "exit":
                    scanner.close();
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}
