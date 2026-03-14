import java.util.Scanner;

public class L2Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        
        int power = scanner.nextInt();
        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers.");
        } else {
            long result = 1;
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }
        scanner.close();
    }
}