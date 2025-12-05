import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();

        
        String[] votingData = {
                "Amit","Sneha","Amit","Rahul","Sneha",
                "Amit","Rohit","Sneha","Rahul","Amit"
        };

        
        for (String candidate : votingData) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

       
        System.out.println("Total Votes:");
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        
        String winner = null;
        int maxVotes = -1;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("\nWinner: " + winner + " w");
    }