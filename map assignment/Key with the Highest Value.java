import java.util.*;

public class MaxValueKey {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Mango", 80);
        map.put("Orange", 65);

        String maxKey = getMaxKey(map);

        System.out.println("Key with highest value: " + maxKey + " = " + map.get(maxKey));
    }

    public static String getMaxKey(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}
