import java.util.*;

public class InvertMapExample {
    public static void main(String[] args) {

        
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
        map.put("D", 3);
        map.put("E", 2);

        
        Map<Integer, List<String>> invertedMap = invertMap(map);

        
        System.out.println("Inverted Map:");
        for (Map.Entry<Integer, List<String>> entry : invertedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> result = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            // Add key to corresponding value's list
            result.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return result;
    }
}
