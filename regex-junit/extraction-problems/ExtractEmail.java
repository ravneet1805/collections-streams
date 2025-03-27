// 1. Extract All Email Addresses from a Text
import java.util.*;
import java.util.regex.*;

class EmailExtractor {
    public static void main(String[] args) {
        System.out.println(extract("Contact us at support@example.com and info@company.org"));
    }

    public static List<String> extract(String text) {
        List<String> emails = new ArrayList<>();
        Matcher matcher = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}").matcher(text);
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }
}