import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Perform calculations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = (num2 != 0) ? num1 / num2 : Double.NaN; // avoid divide by zero

        // Print results
        System.out.println("\nResults:");
        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + difference);
        System.out.println("Multiplication = " + product);
        System.out.println("Division = " + quotient);

        sc.close();
    }
}
