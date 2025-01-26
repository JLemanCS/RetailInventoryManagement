public class Sale {
    private String customerName;
    private int[] itemsPurchased;  // Array of item IDs and quantities
    private double totalAmount;

    // Constructor
    public Sale(String customerName, int[] itemsPurchased) {
        this.customerName = customerName;
        this.itemsPurchased = itemsPurchased;
        this.totalAmount = calculateTotalAmount();
    }

    // Method to calculate total amount of sale
    private double calculateTotalAmount() {
        double total = 0;
        for (int i = 0; i < itemsPurchased.length; i += 2) {
            int itemId = itemsPurchased[i];
            int quantity = itemsPurchased[i + 1];
            total += findProductPriceById(itemId) * quantity;
        }
        return total;
    }

    // Method to find the product price by item ID
    private double findProductPriceById(int itemId) {
        // Logic to search the product database by ID (this will need to be linked to an actual database or product list)
        return 0.0;  // Placeholder, actual implementation should find the product price
    }

    public String getCustomerName() {
        return customerName;
    }

    public int[] getItemsPurchased() {
        return itemsPurchased;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Sale - Customer: " + customerName + ", Total: $" + totalAmount;
    }
}
