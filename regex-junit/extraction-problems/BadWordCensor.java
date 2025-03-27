
// 6. Censor Bad Words in a Sentence
import java.util.*;
import java.util.regex.*;

class BadWordCensor {
    public static void main(String[] args) {
        List<String> badWords = Arrays.asList("damn", "stupid");
        System.out.println(censor("This is a damn bad example with some stupid words.", badWords));
    }

    public static String censor(String text, List<String> badWords) {
        for (String word : badWords) {
            text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
        }
        return text;
    }
}