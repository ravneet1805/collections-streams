// 3. Extract Dates in dd/mm/yyyy Format
import java.util.*;
import java.util.regex.*;

class DateExtractor {
    public static void main(String[] args) {
        System.out.println(extract("The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020."));
    }

    public static List<String> extract(String text) {
        List<String> dates = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(text);
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }
}