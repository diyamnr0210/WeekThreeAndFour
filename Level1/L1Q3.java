import java.util.Scanner;

public class L1Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean firstLargest = (num1 >= num2 && num1 >= num3);
        boolean secondLargest = (num2 >= num1 && num2 >= num3);
        boolean thirdLargest = (num3 >= num1 && num3 >= num2);

        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

        scanner.close();
    }
}