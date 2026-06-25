import java.util.Scanner;

public class GradeDescription {

    public static void main(String[] args) {

        // 98 and above -> Excellent
        // 91-97 -> Very Good
        // 80-90 -> Good
        // 75-79 -> Fair
        // 74 and below -> Failed

        byte grade = 99;

        Scanner scan = new Scanner(System.in);

        System.out.print("Grade: ");
        grade = scan.nextByte();

        if (grade >= 98) {
            System.out.println("Excellent");
        } else if (grade >= 91) {
            System.out.println("Very Good");
        } else if (grade >= 80) {
            System.out.println("Good");
        } else if (grade >= 75) {
            System.out.println("Fair");
        } else {
            System.out.println("Failed");
        }
    }
}