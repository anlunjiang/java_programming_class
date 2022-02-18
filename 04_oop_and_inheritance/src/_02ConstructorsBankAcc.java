public class _02ConstructorsBankAcc {
    private int accNum;
    private double bal;
    private String custNm;
    private String email;
    private String mobile;

    /**
     * This is a constructor! essentially an def __init__ in python!
     * To create the constructor - you need to type the EXACT same name as the class
     * this is the __init__ method in python
     *
     *  Constructors CAN BE OVERLOADED and can call 1 contructor from another
     */
    public _02ConstructorsBankAcc(int accNum, double bal, String custNm, String email, String mobile) {
        this.accNum = accNum;
        this.bal = bal;
        this.custNm = custNm;
        this.email = email;
        this.mobile = mobile;
        // You can call the set methods = but a good rule of thumb for constructors is not to use them
        // And to set the fields directly
        // There are some scenarios where it won't be called if you use setters + it might be that
        // the setter methods aren't even made yet in the constructor
    }

    /**
     * Overloaded constructor - special use of "this" that can only be used in constructors
     * "this" HAS to be the first line that's called
     * You may have many constructors - that should all call the original constructor - best practice
     */
    public _02ConstructorsBankAcc() {
        this(1, 0, "John Smith", "js@gmail.com", "123");
        // This is calling the other constructor!
        System.out.println("Empty Constructor");

    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void depositFunds(double amt) {
        this.bal += amt;
    }

    public void withdrawFunds(double amt) {
        double pendingRet = this.bal - amt;
        if (pendingRet < 0) {
            System.out.println("Not enough funds to withdraw - denied");
        } else {
            this.bal = pendingRet;
        }
    }
}
