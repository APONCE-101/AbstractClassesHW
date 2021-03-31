abstract class User {
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private int absences;

   public User (String firstName, String lastName, String email, String username, String password, int absences) {

       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.username = username;
       this.password = password;
       this.absences = absences;

   }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static void absentDays() {

    }

    public int getAbsences() {

       return getAbsences();
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }

    public abstract void absentDays(int absences);

    @Override

    public String toString() {
       return "User{" +

               "'firstName='" + firstName + '\'' +
               "'lastName='" + lastName + '\'' +
               "email='" + email + '\'' +
               "username='" + username + '\'' +
                "password='" + password + '\'' +
                "absences='" + absences +
            '}';

    }



}
