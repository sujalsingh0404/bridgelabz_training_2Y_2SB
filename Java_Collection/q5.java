import java.util.*;

public class q5 {
    public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        // Union
        Set<Integer> union = new HashSet<>(set1); // copy of set1
        union.addAll(set2);                        // add all elements from set2
        System.out.println("Union: " + union);

        // Intersection
        Set<Integer> intersection = new HashSet<>(set1); // copy of set1
        intersection.retainAll(set2);                   // keep only elements present in set2
        System.out.println("Intersection: " + intersection);
    }
}
