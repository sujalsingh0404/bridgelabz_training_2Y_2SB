import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1 of triangle: ");
        double a = sc.nextDouble();

        System.out.print("Enter side2 of triangle: ");
        double b = sc.nextDouble();

        System.out.print("Enter side3 of triangle: ");
        double c = sc.nextDouble();

        double perimeter = a + b + c;
        double rounds = 5000 / perimeter;

        System.out.println("Athlete needs to run " + rounds + " rounds to complete 5 km.");
        sc.close();
    }
}
