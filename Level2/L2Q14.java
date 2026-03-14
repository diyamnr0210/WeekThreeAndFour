import java.util.Scanner;

public class L2Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int power = scanner.nextInt();

        long result = 1;
        int counter = 0;

        while (counter < power) {
            result = result * number;
            counter++;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}