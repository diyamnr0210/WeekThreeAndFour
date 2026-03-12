import java.util.Scanner;

public class L1Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting value for countdown: ");
        int startValue = scanner.nextInt();

        for (int counter = startValue; counter >= 1; counter--) {
            System.out.println(counter);
        }

        System.out.println("Liftoff!");
        scanner.close();
    }
}