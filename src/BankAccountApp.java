import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) throws Exception {
        String file = "/Users/melaniemai/Downloads/NewBankAccounts.csv";

        /*
         * Checking checkingAccount = new Checking("Tom Wilson", "358955700", 1500);
         * Savings savingsAccount = new Savings("Suzy Low", "796821570", 2500);
         * 
         * savingsAccount.showInfo(); System.out.println("***********");
         * checkingAccount.showInfo();
         * 
         * savingsAccount.compound();
         */

        // Read .cvs file
        List<String[]> newAccounts = CSV.read(file);
        for (String[] accountHolder : newAccounts) {
            System.out.println("NEW ACCOUNT HOLDER:");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }

        // Create new accounts based on data
    }
}
