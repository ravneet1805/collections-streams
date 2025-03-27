// 1️⃣ Validate a Username
class UsernameValidator {
    public static void main(String[] args) {
        System.out.println(isValid("user_123")); // true
        System.out.println(isValid("123user"));  // false
    }

    public static boolean isValid(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }
}