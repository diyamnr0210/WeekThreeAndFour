import java.util.Scanner;

public class L1Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting value for countdown: ");
        int counter = scanner.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Liftoff!");
        scanner.close();
    }
}