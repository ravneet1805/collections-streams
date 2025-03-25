// 9. Nested try-catch

import java.util.Scanner;

class NestedTryCatchDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index: ");
        int index = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();
        try {
            try {
                System.out.println("Result: " + arr[index] / divisor);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

    }
}
