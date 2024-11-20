mport java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        
        // Close the scanner
        scanner.close();
    }

    // Method to check if the number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;  // Store the original number
        int reversedNumber = 0;  // Variable to store the reversed number
        int remainder;

        // Reverse the number
        while (number != 0) {
            remainder = number % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + remainder;  // Build the reversed number
            number /= 10;  // Remove the last digit
        }

        // Check if the original number is equal to the reversed number
        return originalNumber == reversedNumber;
    }
}
