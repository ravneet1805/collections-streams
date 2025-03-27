// 15. Validate a Social Security Number (SSN)
class SSNValidator {
    public static void main(String[] args) {
        System.out.println(isValid("123-45-6789") ? "Valid" : "Invalid"); // Valid
        System.out.println(isValid("123456789") ? "Valid" : "Invalid");  // Invalid
    }

    public static boolean isValid(String ssn) {
        return ssn.matches("^\\d{3}-\\d{2}-\\d{4}$");
    }
}