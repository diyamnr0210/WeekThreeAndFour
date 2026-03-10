import java.util.Scanner;

public class L1Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean isSmallest = (num1 <= num2 && num1 <= num3);

        System.out.println("Is the first number the smallest? " + isSmallest);

        scanner.close();
    }
}