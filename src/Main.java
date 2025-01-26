import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        // Adding sample products
        inventory.addProduct(new Product(1, "Laptop", 1000, 10, 5));
        inventory.addProduct(new Product(2, "Smartphone", 500, 20, 10));

        while (true) {
            System.out.println("Retail Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Process Sale");
            System.out.println("4. Restock Product");
            System.out.println("5. View All Products");
            System.out.println("6. Generate Sales Report");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (choice == 1) {
                // Add Product
                System.out.print("Enter Product ID: ");
                int productId = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                System.out.print("Enter Product Name: ");
                String productName = scanner.nextLine();

                System.out.print("Enter Product Price: ");
                double productPrice = scanner.nextDouble();

                System.out.print("Enter Product Quantity: ");
                int productQuantity = scanner.nextInt();

                System.out.print("Enter Restock Quantity: ");
                int restockQuantity = scanner.nextInt();

                Product product = new Product(productId, productName, productPrice, productQuantity, restockQuantity);
                inventory.addProduct(product);
                System.out.println("Product added successfully!\n");

            } 
            else if (choice == 2) {
                // Remove Product
                System.out.print("Enter Product ID to remove: ");
                int removeId = scanner.nextInt();
                inventory.removeProduct(removeId);
                System.out.println("Product removed successfully!\n");

            } 
            else if (choice == 3) {
                // Process Sale
                System.out.print("Enter Customer Name: ");
                String customerName = scanner.nextLine();

                System.out.print("Enter the number of different items being bought: ");
                int numItems = scanner.nextInt();
                int[] itemsPurchased = new int[numItems * 2];

                for (int i = 0; i < numItems; i++) {
                    System.out.print("Enter Product ID: ");
                    int itemId = scanner.nextInt();

                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();

                    itemsPurchased[i * 2] = itemId;
                    itemsPurchased[i * 2 + 1] = quantity;
                }

                Sale sale = new Sale(customerName, itemsPurchased);
                inventory.processSale(sale);
                System.out.println("Sale processed successfully!\n");

            } 
            else if (choice == 4) {
                // Restock Product
                System.out.print("Enter Product ID to restock: ");
                int restockId = scanner.nextInt();
                inventory.restockProduct(restockId);
                System.out.println("Product restocked successfully!\n");

            } 
            else if (choice == 5) {
                // View All Products
                inventory.viewAllProducts();

            } 
            else if (choice == 6) {
                // Generate Sales Report
                inventory.generateSalesReport();

            } 
            else if (choice == 7) {
                // Quit
                System.out.println("Goodbye!");
                scanner.close();
                break;
            } 
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
