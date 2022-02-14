

public class _02Constructors {
    public static void main(String[] args) {
        _02ConstructorsBankAcc acc1 = new _02ConstructorsBankAcc(
            1,
            0,
            "John Smith",
            "johnsmith@google.com",
            "07123456532"
        );
        acc1.depositFunds(12.3);
        acc1.withdrawFunds(2.34);
        acc1.withdrawFunds(23);
        System.out.println(acc1.getBal());

        _02ConstructorsBankAcc acc2 = new _02ConstructorsBankAcc();
        // empty constructor initialises default values
        System.out.println(acc2.getBal());
    }
}
