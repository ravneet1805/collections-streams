package map_interface;

import java.util.*;

public class KeyWithHighestValue {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("A", 10);
        scores.put("B", 20);
        scores.put("C", 15);

        System.out.println(findMaxKey(scores));
    }

    public static String findMaxKey(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
