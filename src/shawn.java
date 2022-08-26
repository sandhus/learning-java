public class shawn {
    public static void main(String[] args) {

        int studentAge = 27;
        double studentGPA = 3.6;
        String name = "Shawn Sandhu";
        char studentfirstint = name.charAt(0);
        char studentlastint = name.charAt(11);
        boolean perfectattend = false;

        System.out.println("student's name is "+ name);
        System.out.println("student's name is "+ name.length()+" chars long");
        System.out.println("student's age is "+ studentAge);
        System.out.println("student's GPA is "+ studentGPA);
        System.out.println("student's first initial is "+ studentfirstint);
        System.out.println("student's last initial is "+ studentlastint);
        System.out.println("student's attendence is "+ studentAge);
        if (perfectattend) {
            System.out.println("student's attendance is perfect");
        }
        else {
            System.out.println("student's attendance is NOT perfect");
        }

    }

}
