import java.util.Scanner;

public class UserIntroduction {
    public static void main(String[] args) {
        String name_input = "";
        int age_input = 0;
        String hobby_input = "";
    
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your name?: ");
        name_input = scan.nextLine();

        System.out.print("How old are you?: ");
        age_input = scan.nextInt();

        scan.nextLine();

        System.out.print("What is your favorite hobby?: ");
        hobby_input = scan.nextLine();

        System.out.println();

        System.out.println("Nice to meet you, " + name_input + "!\n" + "You are " + age_input + " years old and love " + hobby_input + ".");
        scan.close();
    }

}
