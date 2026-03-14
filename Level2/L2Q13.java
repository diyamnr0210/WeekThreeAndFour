import java.util.Scanner;

public class L2Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Factors of " + number + " below itself:");
            
            int counter = number - 1;
            while (counter >= 1) {
                if (number % counter == 0) {
                    System.out.print(counter + " ");
                }
                
                counter--;
            }
        }

        scanner.close();
    }
}