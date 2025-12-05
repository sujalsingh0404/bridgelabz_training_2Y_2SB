import java.util.*;

public class q8 {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 5));

        if (set1.containsAll(set2)) {
            System.out.println("set2 is a subset of set1.");
        } else {
            System.out.println("set2 is NOT a subset of set1.");
        }

        // Check the reverse
        if (set2.containsAll(set1)) {
            System.out.println("set1 is a subset of set2.");
        } else {
            System.out.println("set1 is NOT a subset of set2.");
        }
    }
}
