package miniproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("Enter command (addProduct,addstock,update,delivery ,display, exit):");
            String command = scanner.nextLine();

            switch (command) {
                case "add":
               
                System.out.println("enter no of products");
                int noof=Integer.parseInt(scanner.nextLine());
                    for(int i=0;i<noof;i++)
                    {
                        System.out.println("Enter product name:");
                        String nameof = scanner.nextLine();

                        System.out.println("Enter quantity to add:");
                        int quantityof= Integer.parseInt(scanner.nextLine());
                        inventory.addProduct(nameof,quantityof);
                    }

                
                    
                
                break;


                case "addstock":
                    System.out.println("Enter product name:");
                    String name = scanner.nextLine();

                    System.out.println("Enter quantity to add:");
                    int quantity = Integer.parseInt(scanner.nextLine());

                    inventory.addStock(name, quantity);
                    break;

                case "update":
                    System.out.println("Enter product name:");
                    name = scanner.nextLine();

                    System.out.println("Enter new stock level:");
                    int stockLevel = Integer.parseInt(scanner.nextLine());

                    inventory.updateStock(name, stockLevel);
                    break;

                case "display":
                    inventory.displayInventory();
                    break;
            case "delivery":
            System.out.println("Enter product name:");
            name = scanner.nextLine();

            System.out.println("Enter quantity:");
            int quantity1 = Integer.parseInt(scanner.nextLine());

                    inventory.deliveredStock(name, quantity1);
                    break;

                case "exit":
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}

