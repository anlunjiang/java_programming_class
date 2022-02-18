package challenges;

public class VipCustomer {
    private final String name;
    private final double creditLimit;
    private final String emailAddress;

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "johnsmith@gmail.com");
    }

    public VipCustomer() {
        this("John Smith", 0.0, "johnsmith@gmail.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
