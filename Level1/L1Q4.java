import java.util.Scanner;

public class L1Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextDouble()) {
            double input = scanner.nextDouble();

            if (input >= 0 && input == Math.floor(input)) {
                long n = (long) input;
                long sum = n * (n + 1) / 2;
                System.out.println("The sum of " + n + " natural numbers is " + sum);
            } else {
                if (input == (long) input) {
                    System.out.println("The number " + (long)input + " is not a natural number");
                } else {
                    System.out.println("The number " + input + " is not a natural number");
                }
            }
        } else {
            System.out.println("Invalid input.");
        }

        scanner.close();
    }
}