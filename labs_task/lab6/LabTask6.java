/*
Q1. Create an interface  Camera and MusicPlayer with some methods , then implement
these methods in Smartphone class  and display messages according to that.

Q2. A shopping store wants to calculate the total cost of products purchased.
Requirements:
a) Store the product ID, product name, price, and quantity.
b) Price and quantity should never be negative.
c) Calculate the total bill amount based on the price and quantity.
d) Display all product details along with the total bill.
*/


// ----------------------------------
//     ~~~  SOLUTION - 1  ~~~
// ----------------------------------

/**
package labs_task.lab6;

// Interface Camera
interface Camera {
    void takePhoto();
    void recordVideo();
}

// Interface MusicPlayer
interface MusicPlayer {
    void playMusic();
    void shuffleMusic();
    void stopMusic();
}

// Smartphone implements both interfaces
class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo using Smartphone camera");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video using Smartphone camera");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music using Smartphone music player");
    }

    @Override
    public void shuffleMusic() {
        System.out.println("Shuffling music using Smartphone music player");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music using Smartphone music player");
    }
}

// Main class
public class SmartphoneDriver {
    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.takePhoto();
        phone.recordVideo();
        phone.playMusic();
        phone.shuffleMusic();
        phone.stopMusic();
    }
}
 */



// ----------------------------------
//     ~~~  SOLUTION - 2  ~~~
// ----------------------------------

/**
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

 */