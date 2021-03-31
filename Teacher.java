public class Teacher extends User {
    private int ptoDays;

    public Teacher(String firstName, String lastName, String email, String username, String password, int absences) {
        super(firstName, lastName, email, username, password, absences);
        ptoDays = 10;

    }

    @Override
    public void absentDays(int absences){
        this.ptoDays -= absences;
        setAbsences(getAbsences()+ absences);
        System.out.println("You have taken " + getAbsences() + " absences.\nYou have " + this.ptoDays + " PTO days left.");
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                " ptoDays=" + ptoDays +
                '}';
    }
}
