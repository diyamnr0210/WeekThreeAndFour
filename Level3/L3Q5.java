import java.util.Scanner;

public class L3Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            // Find each digit (remainder)
            int digit = originalNumber % 10;
            
            // Add the cube of the digit to the sum
            sum = sum + (digit * digit * digit);
            
            // Find the quotient to remove the last digit
            originalNumber = originalNumber / 10;
        }

        if (number == sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}