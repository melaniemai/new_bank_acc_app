public abstract class Account implements IBaseRate {
    // Will not be able to create objects from the Account class -> parent class

    // Common properties between savings and checking account
    String name;
    String ssn;
    double balance;
    String accountNum;
    double rate;

    // Constructor, initialize account
    public Account(String name) {
        System.out.println("ACCOUNT HOLDER: " + name);
        System.out.print("NEW ACCOUNT: ");
    }

    // Common methods
}
