public abstract class Account implements IBaseRate {
    // Will not be able to create objects from the Account class -> parent class

    // Common properties between savings and checking account
    private String name;
    private String ssn;
    private double balance;
    protected String accountNum;
    protected double rate;

    private static int index = 10000;

    // Constructor, initialize account
    public Account(String name, String sSN, double initDep) {
        this.name = name;
        this.ssn = sSN;
        balance = initDep;
        System.out.println("NAME: " + name + " SSN: " + sSN + " BALANCE: $" + balance);

        // Account number
        index++;
        this.accountNum = setAccountNum();

        setRate();
    }

    public abstract void setRate();

    private String setAccountNum() {
        String lastTwoSSN = ssn.substring(ssn.length() - 2, ssn.length());
        int uniqueID = index;
        int randNum = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoSSN + uniqueID + randNum;
    }

    public void compound() {
        double accruedInterest = balance * (rate / 100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBal();
    }

    // Common methods
    public void showInfo() {
        System.out.println("NAME: " + name);
        System.out.println("ACCOUNT NUMBER: " + accountNum);
        System.out.println("ACCOUNT BALANCE: $" + balance);
        System.out.println("Rate: " + rate + "%");
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing $" + amount + " to your account...");
        printBal();
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawing $" + amount + " from your account...");
        printBal();
    }

    public void transfer(String destination, double amount) {
        balance -= amount;
        System.out.println("Transfering $" + amount + " to " + destination + "...");
        printBal();
    }

    public void printBal() {
        System.out.println("Your balance is now: $" + balance);
    }

}
