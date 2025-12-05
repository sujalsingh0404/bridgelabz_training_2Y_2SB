import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {

        String sentence = "Java is fun and Java is powerful!";

        // Step 1 & 2: Convert to lowercase and remove punctuation
        sentence = sentence.toLowerCase().replaceAll("[^a-z0-9 ]", "");

        // Step 3: Split into words
        String[] words = sentence.split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        // Step 4: Count word frequency
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        // Step 5: Print results
        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
