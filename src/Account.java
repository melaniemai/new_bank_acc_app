public abstract class Account implements IBaseRate {
    // Will not be able to create objects from the Account class -> parent class

    // Common properties between savings and checking account
    String name;
    String ssn;
    double balance;
    String accountNum;
    double rate;

    // Constructor, initialize account
    public Account(String name, String sSN, double initDep) {
        this.name = name;
        this.ssn = sSN;
        balance = initDep;
        System.out.println("NAME: " + name + " SSN: " + sSN + " BALANCE: $" + balance);
    }

    // Common methods
}
