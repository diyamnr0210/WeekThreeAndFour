import java.util.Scanner;

public class L2Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amar's age and height: ");
        int ageAmar = scanner.nextInt();
        double heightAmar = scanner.nextDouble();
        System.out.print("Enter Akbar's age and height: ");
        int ageAkbar = scanner.nextInt();
        double heightAkbar = scanner.nextDouble();
        System.out.print("Enter Anthony's age and height: ");
        int ageAnthony = scanner.nextInt();
        double heightAnthony = scanner.nextDouble();
        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }
        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}