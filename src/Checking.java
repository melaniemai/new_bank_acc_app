public class Checking extends Account {
    // Properties specific to checking account
    int debitCardNum;
    int debitCardPIN;

    // Constructor, initialize checking account properties
    public Checking(String name, String sSN, double initDep) {
        super(name, sSN, initDep);
        System.out.println("New checking account");
    }

    // Methods specific to checking account
}
