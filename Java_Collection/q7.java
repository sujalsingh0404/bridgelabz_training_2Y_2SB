import java.util.*;

public class q7 {
    public static void main(String[] args) {

        // Original HashSet
        Set<Integer> numbers = new HashSet<>(Arrays.asList(5, 3, 8, 1, 2));

        // Convert to List
        List<Integer> sortedList = new ArrayList<>(numbers);

        // Sort the list
        Collections.sort(sortedList);

        System.out.println("Sorted List: " + sortedList);
    }
}
