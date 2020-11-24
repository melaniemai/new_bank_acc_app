public class BankAccountApp {
    public static void main(String[] args) throws Exception {
        Checking checkingAccount = new Checking("Tom Wilson", "358955700", 1500);
        Savings savingsAccount = new Savings("Suzy Low", "796821570", 2500);

        savingsAccount.showInfo();
        System.out.println("***********");
        checkingAccount.showInfo();

        savingsAccount.deposit(3000);

        // Read .cvs file

        // Create new accounts based on data
    }
}
