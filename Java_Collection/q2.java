import java.util.*;

public class Frequency {
    public static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();

        for (String str : list) {
            freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
        }

        return freqMap;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Integer> result = findFrequency(words);
        System.out.println(result);
    }
}

