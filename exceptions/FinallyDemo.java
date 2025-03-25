// 7. finally Block Execution

import java.util.Scanner;

class FinallyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            System.out.println("Result: " + numerator / denominator);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!"+ e);
        } finally {
            System.out.println("Operation completed");
        }

    }
}




