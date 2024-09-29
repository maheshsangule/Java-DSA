
import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // String str=new String();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Handle edge cases
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check if the number has any divisors other than 1 and itself
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Number is divisible by i, so it's not prime
            }
        }
        return true; // Number is prime
    }
}
