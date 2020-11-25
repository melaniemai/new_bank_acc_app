public class Checking extends Account {
    // Properties specific to checking account
    private int debitCardNum;
    private int debitCardPIN;

    // Constructor, initialize checking account properties
    public Checking(String name, String sSN, double initDep) {
        super(name, sSN, initDep);
        accountNum = "2" + accountNum;
        System.out.println("ACCOUNT NUMBER: " + this.accountNum);
        System.out.println("New checking account");
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    // Methods specific to checking account
    private void setDebitCard() {
        debitCardNum = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features..." + "\n  Debit Card Number: " + debitCardNum
                + "\n  Debit Card PIN: " + debitCardPIN);
    }
}
