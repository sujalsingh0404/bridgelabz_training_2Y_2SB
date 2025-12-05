import java.util.*;

public class q6 {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        // Compute symmetric difference
        Set<Integer> symDiff = new HashSet<>(set1); // copy of set1
        symDiff.addAll(set2);                       // union of both sets

        Set<Integer> tmp = new HashSet<>(set1);     // copy of set1
        tmp.retainAll(set2);                        // intersection of both sets

        symDiff.removeAll(tmp);                     // remove intersection from union
        System.out.println("Symmetric Difference: " + symDiff);
    }
}
