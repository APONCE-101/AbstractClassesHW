import solution.Admin;
import solution.Teacher;
import solution.User;

public class SchoolDriver {
    public static void main(String[] args) {
        User t1 = new Teacher("Alyssa", "Ponce", "aponce@gmail.com",
                "APONCE", "BadPassword", 0);

        User a1 = new Admin("Severus", "Snape", "snape@hogwarts.art",
                "magicMan", "iKilledDumbledore", 0);

        User a2 = new Admin("Amy", "Gary","AmyG@goog.com","Garmy","ILoveFlowers",9);

        User t2 = new Teacher("Stan","Marsh","StanMarsh@yahoo.com","SMarsh","SPark09",0);

        System.out.println("Teacher takes leave:");
        t1.absentDays(2);


        System.out.println("Admin takes leave:");
        a1.absentDays(5);

        System.out.println("Teacher takes leave:");
        t2.absentDays(5);

        System.out.println("Admin takes leave:");
        a2.absentDays(4);

    }
}