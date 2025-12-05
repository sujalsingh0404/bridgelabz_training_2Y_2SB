import java.util.*;

public class SqualityChecketE {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 3, 2, 1));

        if (set1.equals(set2)) {
            System.out.println("Both sets are equal.");
        } else {
            System.out.println("Sets are not equal.");
        }
    }
}
