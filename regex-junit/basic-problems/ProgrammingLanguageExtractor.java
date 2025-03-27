// 12. Extract Programming Language Names from a Text
import java.util.*;
import java.util.regex.*;
class ProgrammingLanguageExtractor {
    public static void main(String[] args) {
        System.out.println(extract("I love Java, Python, and JavaScript, but I haven't tried Go yet."));
    }

    public static List<String> extract(String text) {
        List<String> languages = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b(JavaScript|Java|Python|C\\+\\+|C#|Ruby|Go|Swift|Kotlin|PHP|TypeScript|Rust)\\b").matcher(text);
        while (matcher.find()) {
            languages.add(matcher.group());
        }
        return languages;
    }
}