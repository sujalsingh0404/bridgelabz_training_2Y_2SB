import java.util.*;

public class RotateList {
    public static <T> void rotateList(List<T> list, int k) {
        int size = list.size();
        k = k % size; // To handle rotations greater than size

        // Reverse technique
        Collections.reverse(list);
        Collections.reverse(list.subList(0, k));
        Collections.reverse(list.subList(k, size));
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int k = 2; // rotate by 2 positions

        rotateList(numbers, k);
        System.out.println(numbers);
    }
}
