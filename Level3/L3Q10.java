import java.util.Scanner;

public class L3Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        String op = scanner.next();

        double result;

        switch (op) {
            case "+":
                result = first + second;
                System.out.println(result);
                break;
            case "-":
                result = first - second;
                System.out.println(result);
                break;
            case "*":
                result = first * second;
                System.out.println(result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println(result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }

        scanner.close();
    }
}