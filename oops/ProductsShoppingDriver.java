abstract class Product {

    private int productId;
    private String productName;
    private double price;

    // Constructor for initializing product details
    Product(int productId, String productName, double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative.");
            return;
        }
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // Calculate total cost of Products
    double calculateTotal(int quantity) {
        return getPrice() * quantity;
    }

    double calculateDiscountedPrice(int quantity) {
        return calculateTotal(quantity) * (1 - discountRate / 100);
    }

    abstract void displayProducts(int quantity);
}

class Electronics extends Product {

    private double discountRate;

    public Electronics(int productId, String productName, double price, double discountRate) {
        super(productId, productName, price);
        this.discountRate = discountRate;
    }

    @Override
    double calculateDiscountedPrice(int quantity) {
        return (getPrice() * quantity) * (1 - discountRate / 100);
    }

    @Override
    double calculateTotal(int quantity) {

        if (quantity <= 0) {
            System.out.println("Invalid Quantity");
            return 0;
        }
        return getPrice() * quantity;
    }

    @Override
    void displayProducts(int quantity) {
        System.out.println("Product ID   : " + super.getProductId());
        System.out.println("Product Name : " + super.getProductName());
        System.out.println("Price        : " + super.getPrice());
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Price   : " + calculateTotal(quantity));
        System.out.println("Discounted Price: " + calculateDiscountedPrice(quantity));
    }
}

class Clothing extends Product {

    private double discountRate;

    public Clothing(int productId, String productName, double price, double discountRate) {
        super(productId, productName, price);
        this.discountRate = discountRate;
    }

    @Override
    double calculateDiscountedPrice(int quantity) {
        return (getPrice() * quantity) * (1 - discountRate / 100);
    }

    @Override
    double calculateTotal(int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid Quantity");
            return 0;
        }
        return getPrice() * quantity;
    }

    @Override
    void displayProducts(int quantity) {
        System.out.println("Product ID   : " + getProductId());
        System.out.println("Product Name : " + getProductName());
        System.out.println("Price        : " + getPrice());
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Price   : " + calculateTotal(quantity));
        System.out.println("Discounted Price: " + calculateDiscountedPrice(quantity));
    }
}

public class ProductsShoppingDriver {

    public static void main(String[] args) {

        System.out.println("------ Welcome To Gupta Products Shopping System ------");

        System.out.println("Electronics Products: ");
        Electronics e1 = new Electronics(101, "Smartphone", 15000, 25);
        Electronics e2 = new Electronics(102, "Earphones", 250, 15);

        int quantity1 = 2;
        int quantity2 = 3;

        System.out.println("------ Product Details ------");
        e1.displayProducts(quantity1);
        System.out.println("-----------------------------");
        e2.displayProducts(quantity2);

        System.out.println("Clothing Products: ");
        Clothing c1 = new Clothing(201, "Shirts", 500, 20);
        Clothing c2 = new Clothing(202, "Trousers", 700, 30);

        int quantity3 = 3;
        int quantity4 = 2;

        System.out.println("------ Product Details ------");
        c1.displayProducts(quantity3);
        System.out.println("-----------------------------");
        c2.displayProducts(quantity4);

        System.out.println("------ Thank you to visiting our store ------");
    }
}
