// 10. Validate an IP Address
class IPAddressValidator {
    public static void main(String[] args) {
        System.out.println(isValid("192.168.1.1")); // true
        System.out.println(isValid("999.999.999.999")); // false
    }

    public static boolean isValid(String ip) {
        return ip.matches("^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$");
    }
}