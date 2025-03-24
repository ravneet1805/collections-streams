
import java.util.*;

public class RemoveDuplicates {
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (!seen.contains(item)) {
                result.add(item);
                seen.add(item);
            }
        }
        return result;
    }
}
