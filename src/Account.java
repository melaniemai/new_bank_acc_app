public abstract class Account implements IBaseRate {
    // Will not be able to create objects from the Account class -> parent class

    // Common properties between savings and checking account
    String name;
    String ssn;
    double balance;
    String accountNum;
    double rate;

    static int index = 10000;

    // Constructor, initialize account
    public Account(String name, String sSN, double initDep) {
        this.name = name;
        this.ssn = sSN;
        balance = initDep;
        System.out.println("NAME: " + name + " SSN: " + sSN + " BALANCE: $" + balance);

        // Account number
        index++;
        this.accountNum = setAccountNum();
        System.out.println("ACCOUNT NUMBER: " + this.accountNum);

    }

    private String setAccountNum() {
        String lastTwoSSN = ssn.substring(ssn.length() - 2, ssn.length());
        int uniqueID = index;
        int randNum = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoSSN + uniqueID + randNum;
    }

    // Common methods
}
