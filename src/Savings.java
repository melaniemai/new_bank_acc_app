public class Savings extends Account {
    // Properties specific to savings account
    int safetyDepID;
    int safetyDepBoxKey;

    // Constructor, initialize settings for savings properties
    public Savings(String name) {
        super(name);
        System.out.println("New savings account");
    }

    // Methods specific to savings account
}
