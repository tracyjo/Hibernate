package company;
        import java.io.Serializable;

/**
 * Created by josephtracy on 4/25/16.
 */

public class Character implements Serializable {
    private String firstName;
    private String lastName;
    private int age;

    public Character() {
    }

    public Character(String aFirstName, String aLastName, int anAge) {
        this.firstName = aFirstName;
        this.lastName = aLastName;
        this.age = anAge;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Character{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

        public String toStringSimple() {
            return "Character = " + firstName + " " + lastName + ", " + age;
    }
}