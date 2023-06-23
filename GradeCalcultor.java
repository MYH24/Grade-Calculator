import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your test score: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Your grade is A.");
        } else if (score >= 80) {
            System.out.println("Your grade is B.");
        } else if (score >= 70) {
            System.out.println("Your grade is C.");
        } else if (score >= 60) {
            System.out.println("Your grade is D.");
        } else {
            System.out.println("Your grade is F.");
        }

        scanner.close();
    }
}
