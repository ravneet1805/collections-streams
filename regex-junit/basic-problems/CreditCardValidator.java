// 11. Validate a Credit Card Number
class CreditCardValidator {
    public static void main(String[] args) {
        System.out.println(isValid("4111111111111111")); // true (Visa)
        System.out.println(isValid("5111111111111111")); // true (MasterCard)
        System.out.println(isValid("6111111111111111")); // false (Not Visa/MasterCard)
    }

    public static boolean isValid(String cardNumber) {
        return cardNumber.matches("^(4\\d{15}|5[1-5]\\d{14})$");
    }
}