import java.util.Scanner;

public class shawn {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10 :");
        Scanner user_input = new Scanner(System.in);
        int user_in = user_input.nextInt();

        if (user_in >0 & user_in <5) {
            System.out.println("Enjoy good luck a freind brings you");
        } else if (user_in >5 & user_in <10) {
            System.out.println("Your Shoes will make you happy today");
        }
        else {
            System.out.println("Invalid Entry");
        }
    }
}
