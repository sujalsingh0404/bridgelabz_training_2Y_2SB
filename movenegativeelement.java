public class movenegativeelement {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        int n = arr.length;
        int j = 0; 

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        
        System.out.print("Rearranged Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
