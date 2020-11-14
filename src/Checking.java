public class Checking extends Account {
    // Properties specific to checking account

    // Constructor, initialize checking account properties
    public Checking(String name) {
        super(name);
        System.out.println("New checking account");
        System.out.println("Account holder: " + name);
    }

    // Methods specific to checking account
}
