public class Product {
    private int itemId;
    private String itemName;
    private double itemPrice;
    private int quantity;
    private int restockQuantity;

    // Constructor
    public Product(int itemId, String itemName, double itemPrice, int quantity, int restockQuantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        this.restockQuantity = restockQuantity;
    }

    // Getters and Setters
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRestockQuantity() {
        return restockQuantity;
    }

    public void setRestockQuantity(int restockQuantity) {
        this.restockQuantity = restockQuantity;
    }

    // Method to update quantity after a sale
    public void updateQuantity(int quantitySold) {
        this.quantity -= quantitySold;
    }

    @Override
    public String toString() {
        return "Product ID: " + itemId + ", Name: " + itemName + ", Price: $" + itemPrice + ", Stock: " + quantity;
    }
}
