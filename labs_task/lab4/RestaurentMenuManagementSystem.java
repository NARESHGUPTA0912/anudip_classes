/**
 * Lab Task - 4
 * Assignment - Restaurant Menu Management System (Java Strings).
 */

package labs_task.lab4;
import java.util.Scanner;

public class RestaurentMenuManagementSystem {
    public static void main(String[] args) {
        
        // Menu in Single String
        String menu = "Pizza, Burger, Pasta, Sandwich, Momos, French Fries, Garlic Bread, Noodles, Spring Rolls, Cold Coffee";

        // 1) Display the complete menu
        System.out.println("Complete Menu: " + menu);

        // 2) Print Menu in Uppercase and lowercase
        System.out.println("Menu in UpperCase: " + menu.toUpperCase());
        System.err.println("Menu in LowerCase: " + menu.toLowerCase());

        // 3) Add new item "Fries" in the end
        String newItem = ", " + "Fries";
        menu = menu.concat(newItem);
        System.out.println("Menu after adding new item: " + menu);


        // 4) Find Position Of Pasta
        String[] menuArr = menu.split(", ");
        int position = -1;
        for (int i = 0; i < menuArr.length; i++) {
            if (menuArr[i].equals("Pasta")) {
                position = i + 1; 
                break;
            }
        }
        System.out.println("Position of Pasta: " + position);


        // 5) Replace Burger with Wrap
        menu = menu.replace("Burger", "Wrap");
        System.out.println("Menu after replacing Burger with Wrap: " + menu);

        // 6) Extract only word "Sandwich"
        String sandwich = menu.substring(20, 28);
        System.out.println("Extracted word: " + sandwich);

        // 7) Display first five chars from menu
        String firstFivesChars = menu.substring(0, 5);
        System.out.println("First five characters: " + firstFivesChars);

        // 8) Split the menu into individual items and display each item in new line
        String[] menuItems = menu.split(", ");
        System.out.println("Menu Items: ");
        for (String item : menuItems) {
            System.out.println(item);
        }


        // 9) Compare the strings using Pizza and pizza
        String str1 = "Pizza";
        String str2 = "pizza";
        boolean res = str1 == str2;     // only compare Object Reference
        System.out.println("Are the strings equal using '=='? " + res);

        boolean isEqual = str1.equals(str2);      // compare String values (case sensitive)
        System.out.println("Are the strings equal using 'equals()'? " + isEqual);

        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);    // compare String values (ignore case)
        System.out.println("Are the strings equal using 'equalsIgnoreCase()'? " + isEqualIgnoreCase);


        // 10) Compare Pizza and Pasta using compareTo() method
        String str3 = "Pizza";
        String str4 = "Pasta";
            /* compare each character lexicographically and when find two different char then return their difference in int */
        int compareResult = str3.compareTo(str4);
        System.out.println("Result of comparing Pizza and Pasta using compareTo(): " + compareResult);


        // 11) Convert integer 299 in string
        String todaySpecialPrice = String.valueOf(299);
        System.out.println("Today's Special Price : " + todaySpecialPrice);

        // 12) Count and display total no of food items in the menu
        String[] items = menu.split(", ");
        int totalItems = items.length;
        System.out.println("Total number of food items in the menu: " + totalItems);

        // 13) ask user and check if the item is available in the menu or not and print message
        try (
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the food item to check availability: ");
            String userAsked = scanner.nextLine();
            String message = menu.contains(userAsked) 
                             ? "Yes, this food item is available in our menu" 
                             : "No, this food item is not available in our menu" ; 
            System.out.println(message);
        }

        // 14) Finally, display updated menu after all the modification
        System.out.println("Updated Menu: " + menu);

    }
}
