package labs_task.lab6;

class Products {

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    // Constructor for initializing product details
    Products(int productId, String productName, double price, int quantity) {

        if(price < 0 || quantity < 0) {
            System.out.println("Price and quantity cannot be negative.");
            return;
        }

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }


    // Calculate total cost
    double calculateTotal() {
        return price * quantity;
    }


    // Display product details
    void displayProducts() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Bill   : " + calculateTotal());
    }
}


public class Shopping {
    public static void main(String[] args) {

        Products p1 = new Products(101, "Laptop", 55000, 2);
        Products p2 = new Products(102, "Mouse", 500, 3);

        System.out.println("Product Details");
        System.out.println("----------------");
        p1.displayProducts();
        System.out.println();
        p2.displayProducts();
    }
}