package challenges;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String input) {
        this.firstName = input;
    }

    public void setLastName(String input) {
        this.lastName = input;
    }

    public void setAge(int input) {
        if (input < 0 || input > 100) {
            this.age = 0;
        } else {
            this.age = input;
        }
    }

    public boolean isTeen() {
        return ((this.age > 12) && (this.age < 20));
    }

    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        }

        if (this.lastName.isEmpty()) {
            return this.firstName;
        }

        if (this.firstName.isEmpty()) {
            return this.firstName;
        }

        return this.firstName + " " + this.lastName;
    }

}