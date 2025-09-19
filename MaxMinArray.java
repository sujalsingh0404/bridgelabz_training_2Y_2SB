public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, -2};

        int max = arr[0];  // assume first element is max
        int min = arr[0];  // assume first element is min

        // Traverse the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }
}
