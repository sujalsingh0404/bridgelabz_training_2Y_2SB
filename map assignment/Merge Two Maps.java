import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 30);
        map1.put("Banana", 20);
        map1.put("Mango", 50);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Banana", 25);
        map2.put("Mango", 10);
        map2.put("Orange", 40);

        Map<String, Integer> mergedMap = mergeMaps(map1, map2);

        System.out.println("Merged Map:");
        for (Map.Entry<String, Integer> entry : mergedMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);  // start with map1

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.merge(en
