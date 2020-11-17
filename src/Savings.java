public class Savings extends Account {
    // Properties specific to savings account
    int safetyDepID;
    int safetyDepBoxKey;

    // Constructor, initialize settings for savings properties
    public Savings(String name, String sSN, double initDep) {
        super(name, sSN, initDep);
        System.out.println("New savings account");
    }

    // Methods specific to savings account
}
