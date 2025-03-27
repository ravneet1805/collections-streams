// 3. Validate a Hex Color Code
class HexColorValidator {
    public static void main(String[] args) {
        System.out.println(isValid("#FFA500")); // true
        System.out.println(isValid("#123"));    // false
    }

    public static boolean isValid(String color) {
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }
}