public class Savings extends Account {
    // Properties specific to savings account
    private int safetyDepID;
    private int safetyDepBoxKey;

    // Constructor, initialize settings for savings properties
    public Savings(String name, String sSN, double initDep) {
        super(name, sSN, initDep);
        accountNum = "1" + accountNum;
        System.out.println("ACCOUNT NUMBER: " + this.accountNum);
        System.out.println("New savings account");

        setSafetyDepBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    // Methods specific to savings account

    private void setSafetyDepBox() {
        safetyDepID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println("Your Savings Account Features... " + "\n  Safety Deposit Box ID: " + safetyDepID
                + "\n  Safety Deposit Box Key: " + safetyDepBoxKey);
    }
}
