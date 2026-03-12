import java.util.Scanner;
public class L1Q15 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number >= 0) {
                long factorial = 1;
                int temp = number;
                for (int i = 0; i < number; i++){
                	factorial *= number - i;
                }
                System.out.println("The factorial of " + number + " is " + factorial);
            } else {
                System.out.println("The number " + number + " is not a positive integer");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close();
    }
}