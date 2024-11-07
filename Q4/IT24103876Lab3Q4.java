import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
        
        // Ensure the input is a five-digit number
        if (number >= 10000 && number <= 99999) {
            // Extract each digit from the number
            int firstDigit = number / 10000;
            int secondDigit = (number / 1000) % 10;
            int thirdDigit = (number / 100) % 10;
            int fourthDigit = (number / 10) % 10;
            int fifthDigit = number % 10;
            
            // Print the digits separated by spaces
            System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + fourthDigit + " " + fifthDigit);
        } else {
            // If the number is not five digits, print an error message
            System.out.println("Error: Please enter a valid five-digit number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
