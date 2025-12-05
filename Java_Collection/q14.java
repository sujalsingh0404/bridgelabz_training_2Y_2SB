import java.util.*;

public class FeedbackManager {
    public static void main(String[] args) {

        // 1. Add feedback messages
        List<String> feedbackList = new ArrayList<>();
        feedbackList.add("Great service!");
        feedbackList.add("Loved the product.");
        feedbackList.add("Great service!"); // duplicate
        feedbackList.add("Could be better.");
        feedbackList.add("Loved the product."); // duplicate
        feedbackList.add("Fast delivery!");

        System.out.println("Original Feedback List:");
        for (String f : feedbackList) System.out.println(f);

        // 2. Remove duplicates using Set
        Set<String> uniqueFeedbacks = new LinkedHashSet<>(feedbackList);
        System.out.println("\nUnique Feedbacks:");
        for (String f : uniqueFeedbacks) System.out.println(f);

        // 3. Process sequentially using Queue
        Queue<String> feedbackQueue = new LinkedList<>(uniqueFeedbacks);
        System.out.println("\nProcessing Feedbacks:");
        while (!feedbackQueue.isEmpty()) {
            String feedback = feedbackQueue.poll();
            System.out.println("Processing: " + feedback);
        }

        // 4. Track most recent feedbacks using Stack
        Stack<String> recentStack = new Stack<>();
        for (String feedback : uniqueFeedbacks) {
            recentStack.push(feedback);
        }

        System.out.println("\nMost Recent Feedbacks (Top 3):");
        int count = 0;
        while (!recentStack.isEmpty() && count < 3) {
            System.out.println(recentStack.pop());
            count++;
        }
    }
}
