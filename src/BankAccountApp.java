import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) throws Exception {
        String file = "/Users/melaniemai/Downloads/NewBankAccounts.csv";

        // Create new accounts based on data
        List<Account> bankAccounts = new LinkedList<Account>();

        // Read .cvs file
        List<String[]> newAccounts = CSV.read(file);
        for (String[] accountHolder : newAccounts) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initialDep = Double.parseDouble(accountHolder[3]);

            if (accountType.equals("Savings")) {
                System.out.println("Open a SAVINGS account.");
                bankAccounts.add(new Savings(name, sSN, initialDep));
            } else if (accountType.equals("Checking")) {
                System.out.println("Open a CHECKING account.");
                bankAccounts.add(new Checking(name, sSN, initialDep));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE.");
            }
        }

        for (Account acc : bankAccounts) {
            System.out.println("\n***************\n");
            acc.showInfo();
        }

    }
}
