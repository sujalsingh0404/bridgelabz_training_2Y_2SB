import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxCount = 0;
        char maxChar = ' ';
        for (char ch : str.toCharArray()) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (ch == c) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = ch;
            }
        }
        System.out.println("Most Frequent Character: " + maxChar);
    }
}
