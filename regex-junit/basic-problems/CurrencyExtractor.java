// 13. Extract Currency Values from a Text
import java.util.*;
import java.util.regex.*;
class CurrencyExtractor {
    public static void main(String[] args) {
        System.out.println(extract("The price is $45.99, and the discount is 10.50."));
    }

    public static List<String> extract(String text) {
        List<String> prices = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);
        while (matcher.find()) {
            prices.add(matcher.group());
        }
        return prices;
    }
}