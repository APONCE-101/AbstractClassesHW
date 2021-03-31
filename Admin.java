public class Admin extends User {

        private int ptoDays;

        public Admin(String fName, String lName, String email,
                     String username, String password, int absences) {
            super(fName, lName, email, username, password, absences);
            ptoDays = 20;
        }

        @Override
        public void absentDays(int absences) {
            this.ptoDays -= absences;
            setAbsences(getAbsences() + absences);
            System.out.println("You have taken " + getAbsences() + " absences.\nYou have " + this.ptoDays + " PTO days left.");
        }

        @Override
        public String toString() {
            return "Admin{" +
                    "ptoDays=" + ptoDays +
                    '}';
        }
    }
