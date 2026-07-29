public class ArithmeticMethodsDemo {
    public static void main(String[] args) {
        performArithmeticOperations(15, 0);

        System.out.println(isPrime(37));    // true
        System.out.println(isPrime(48));    // false
    }

    public static void performArithmeticOperations(int a, int b) {
        System.out.println("Addition of a & b: "+(a+b));
        System.out.println("Subtraction of a & b: "+(a-b));
        System.out.println("Multiplication of a & b: "+(a*b));
        // System.out.println("Division of two number is: " + a/b); // exception occured
        String result = (b==0?"Cannot divide by 0":"Division of two number is: " + a/b);
        System.out.println(result);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; 
        }else if (n == 2 || n == 3) {
            return true; 
        }else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Helper: sum of square of digits
    public static int sumOfSquareDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    // 1️⃣ Check Happy Number
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        // Floyd Cycle Detection
        do {
            slow = sumOfSquareDigits(slow);
            fast = sumOfSquareDigits(sumOfSquareDigits(fast));
        } while (slow != fast);

        return slow == 1;
    }
}