
// 4. Extract Links from a Web Page
import java.util.*;
import java.util.regex.*;

class LinkExtractor {
    public static void main(String[] args) {
        System.out.println(extract("Visit https://www.google.com and http://example.org for more info."));
    }

    public static List<String> extract(String text) {
        List<String> links = new ArrayList<>();
        Matcher matcher = Pattern.compile("https?://[\\w.-]+").matcher(text);
        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }
}