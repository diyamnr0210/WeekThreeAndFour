import java.util.Scanner;

public class L1Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        if (scanner.hasNextDouble()) {
            double input = scanner.nextDouble();

            if (input >= 0 && input == Math.floor(input)) {
                long n = (long) input;

                long formulaSum = n * (n + 1) / 2;

                long loopSum = 0;
                for (int i = 1; i <= n; i++) {
                    loopSum += i;
                }

                System.out.println("Sum using formula: " + formulaSum);
                System.out.println("Sum using for loop: " + loopSum);

                if (formulaSum == loopSum) {
                    System.out.println("Result: Both computations are correct and match.");
                } else {
                    System.out.println("Result: Discrepancy found in computations.");
                }
            } else {
                System.out.println("The number " + input + " is not a natural number");
            }
        } else {
            System.out.println("Invalid input.");
        }

        scanner.close();
    }
}