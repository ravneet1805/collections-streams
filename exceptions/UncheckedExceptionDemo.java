// 2. Unchecked Exception (Runtime Exception)

import java.util.InputMismatchException;
import java.util.Scanner;

class UncheckedExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        } finally {
        }
    }
}