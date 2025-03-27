// 14. Find Repeating Words in a Sentence
import java.util.*;
import java.util.regex.*;
class RepeatingWordFinder {
    public static void main(String[] args) {
        System.out.println(findRepeatingWords("This is is a repeated repeated word test."));
    }

    public static Set<String> findRepeatingWords(String text) {
        Set<String> repeatedWords = new HashSet<>();
        Matcher matcher = Pattern.compile("\\b(\\w+)\\b\\s+\\b\\1\\b", Pattern.CASE_INSENSITIVE).matcher(text);
        while (matcher.find()) {
            repeatedWords.add(matcher.group(1));
        }
        return repeatedWords;
    }
}