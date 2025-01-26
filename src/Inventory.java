import java.util.*;

public class Inventory {
    private List<Product> products;
    private List<Sale> sales;

    // Constructor
    public Inventory() {
        this.products = new ArrayList<>();
        this.sales = new ArrayList<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove a product from the inventory
    public void removeProduct(int productId) {
        products.removeIf(product -> product.getItemId() == productId);
    }

    // Update product quantity after a sale
    public void processSale(Sale sale) {
        for (int i = 0; i < sale.getItemsPurchased().length; i += 2) {
            int itemId = sale.getItemsPurchased()[i];
            int quantity = sale.getItemsPurchased()[i + 1];
            for (Product product : products) {
                if (product.getItemId() == itemId) {
                    product.updateQuantity(quantity);
                    break;
                }
            }
        }
        sales.add(sale);
    }

    // Restock products if stock is 0
    public void restockProduct(int productId) {
        for (Product product : products) {
            if (product.getItemId() == productId && product.getQuantity() == 0) {
                product.setQuantity(product.getRestockQuantity());
            }
        }
    }

    // Generate sales report
    public void generateSalesReport() {
        for (Sale sale : sales) {
            System.out.println(sale);
        }
    }

    // View all products in inventory
    public void viewAllProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Print product details
    public void printProductDetails(int productId) {
        for (Product product : products) {
            if (product.getItemId() == productId) {
                System.out.println(product);
                break;
            }
        }
    }
}
