import java.util.*;

public class ReverseListDemo {
    public static void main(String[] args) {

        // ArrayList Example
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original ArrayList: " + arrayList);
        reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // LinkedList Example
        List<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("\nOriginal LinkedList: " + linkedList);
        reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }

    // Method to reverse any List type (ArrayList or LinkedList)
    public static <T> void reverseList(List<T> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap elements
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }
}
