
import java.util.LinkedList;

public class NthElementFromEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (n <= 0 || n > list.size()) {
            throw new IllegalArgumentException("Invalid N value");
        }

        int indexFromStart = list.size() - n;
        return list.get(indexFromStart);
    }
}
