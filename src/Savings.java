public class Savings extends Account {
    // Properties specific to savings account
    int safetyDepID;
    int safetyDepBoxKey;

    // Constructor, initialize settings for savings properties
    public Savings(String name, String sSN, double initDep) {
        super(name, sSN, initDep);
        accountNum = "1" + accountNum;
        System.out.println("ACCOUNT NUMBER: " + this.accountNum);
        System.out.println("New savings account");
    }

    // Methods specific to savings account

    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");
    }
}
