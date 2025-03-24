
import java.util.*;

public class RotateList {
    public static <T> List<T> rotate(List<T> list, int positions) {
        int size = list.size();
        positions = positions % size; // Handle positions greater than size
        List<T> rotatedList = new ArrayList<>(list.subList(positions, size));
        rotatedList.addAll(list.subList(0, positions));
        return rotatedList;
    }
}
