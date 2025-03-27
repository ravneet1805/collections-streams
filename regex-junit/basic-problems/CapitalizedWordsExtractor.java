// 5. Extract All Capitalized Words from a Sentence

import java.util.*;
import java.util.regex.*;

class CapitalizedWordsExtractor {
    public static void main(String[] args) {
        System.out.println(extract("The Eiffel Tower is in Paris and the Statue of Liberty is in New York."));
    }

    public static List<String> extract(String text) {
        List<String> words = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }
}