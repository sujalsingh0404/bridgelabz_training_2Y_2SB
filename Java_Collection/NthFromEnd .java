import java.util.LinkedList;

public class NthFromEnd {

    // Method to find Nth element from end
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        var fast = list.listIterator();
        var slow = list.listIterator();

        // Move fast pointer n steps forward
        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                return null; // If n is greater than list size
            }
        }

        // Move both pointers until fast reaches the end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        // slow now points to Nth node from end
        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 10; i++) list.add(i); // List = 1 to 10

        int N = 3; // 3rd from last → should return 8

        Integer result = findNthFromEnd(list, N);

        if (result != null)
            System.out.println(N + "rd element from end is: " + result);
        else
            System.out.println("N is larger than list size!");
    }
}
