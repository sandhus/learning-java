import java.util.Scanner;

public class shawn {

    public static void main(String[] args) {

        double studentGPA = 3.6;
        String name = "Shawn Sandhu";
        boolean perfectattend = false;

        System.out.println("student's name is "+ name);
        System.out.println("student's name is "+ name.length()+" chars long");
        System.out.println("student's old GPA is "+ studentGPA);
        System.out.println("Do you want to update GPA for "+ name +
                "Please add it here:");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        if (studentGPA > 4) {
            System.out.println("Invalid Entry");
        }
        else {
            System.out.println("student's new GPA is "+ studentGPA);
        }
        if (perfectattend) {
            System.out.println("student's attendance is perfect");
        }
        else {
            System.out.println("student's attendance is NOT perfect");
        }

    }
}
