import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) result += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch)) result += Character.toUpperCase(ch);
            else result += ch;
        }
        System.out.println("Toggled: " + result);
    }
}
