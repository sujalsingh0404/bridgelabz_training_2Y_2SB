import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {

        
        Map<String, Double> grades = new HashMap<>();

       
        grades.put("Rahul", 85.5);
        grades.put("Amit", 92.0);
        grades.put("Sneha", 78.0);
        grades.put("Priya", 88.5);

        System.out.println("Initial Student Grades:");
        printSorted(grades);

        
        System.out.println("\nUpdating Sneha's grade...");
        grades.put("Sneha", 90.0);   // overwrite the old value

       
        System.out.println("Removing Amit from the list...");
        grades.remove("Amit");

       
        System.out.println("\nFinal Student Grades (Sorted):");
        printSorted(grades);
    }

    
    public static void printSorted(Map<String, Double> map) {
        Map<String, Double> sorted = new TreeMap<>(map);  // TreeMap sorts keys alphabetically

        for (Map.Entry<String, Double> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
