
public class Kid {

    private String firstName;
    private String lastName;
    private char gender;
    private int age;
    private boolean wasGood;

    public Kid(String firstName, String lastName, String gender, String age, String wasGood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender.charAt(0);
        this.age = Integer.parseInt(age);
        this.wasGood = Boolean.parseBoolean(wasGood);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWasGood() {
        return wasGood;
    }

    public void setWasGood(boolean wasGood) {
        this.wasGood = wasGood;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + gender + " "+ age + " " + wasGood;
    }
}
