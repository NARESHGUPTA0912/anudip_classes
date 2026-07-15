package Looping_Statements;
import java.util.Scanner;

public class FindLuckyNumber {
    public static void main(String[] args) {
        int num = 0, count=0;
        int lucky = 7;
        try (Scanner sc = new Scanner(System.in)) {
            while(num != lucky){
                count++;
                System.out.println("Enter your number: ");
                num = sc.nextInt();
                if(num != lucky) {
                    System.out.println("Try Again");
                }
            }
        }
        System.out.println("You are find the " + lucky + " number in " + count + " attempts.");
    }
}
