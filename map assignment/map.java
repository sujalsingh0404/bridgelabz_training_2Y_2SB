import java.io.*;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        
        String fileName = "input.txt";   

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                
                line = line.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

                String[] words = line.split("\\s+"); 

                for (String word : words) {
                    if (word.length() > 0) {  
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        }

        
        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
