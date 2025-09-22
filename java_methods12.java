import java.util.Scanner;

public class ReplaceMethod {
    public static String replace(String str, char oldChar, char newChar) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if (ch == oldChar) result += newChar;
            else result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char oldChar = sc.next().charAt(0);
        char newChar = sc.next().charAt(0);
        System.out.println("Modified String: " + replace(str, oldChar, newChar));
    }
}
