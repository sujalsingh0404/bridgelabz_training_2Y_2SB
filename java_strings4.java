import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) == -1) result += ch;
        }
        System.out.println("Modified String: " + result);
    }
}
