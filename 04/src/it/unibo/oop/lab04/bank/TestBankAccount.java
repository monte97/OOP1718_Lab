package it.unibo.oop.lab04.bank;

//CHECKSTYLE:OFF
public final class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {

        final AccountHolder usr1 = new AccountHolder("Mario", "Rossi", 1);
        final AccountHolder usr2 = new AccountHolder("Luigi", "Bianchi", 2);

        final BankAccount acc1 = new SimpleBankAccount(usr1.getUserID(), 0);

        // TODO Change the implementation from StrictBankAccount to ExtendedStrictBankAccount
        final BankAccount acc2 = new ExtendedStrictBankAccount(usr2.getUserID(), 0);
//        final BankAccount acc2 = new StrictBankAccount(usr2.getUserID(), 0);


        acc1.deposit(usr1.getUserID(), 10000);
        acc2.deposit(usr2.getUserID(), 10000);
        acc1.withdraw(usr1.getUserID(), 15000);
        acc2.withdrawFromATM(usr2.getUserID(), 15000);

        System.out.println("Mario Rossi account balance is " + acc1.getBalance());
        System.out.println("Luigi Bianchi account balance is " + acc2.getBalance());

        acc1.deposit(usr1.getUserID(), 10000);
        acc2.deposit(usr2.getUserID(), 10000);
        acc1.computeManagementFees(usr1.getUserID());
        acc2.computeManagementFees(usr2.getUserID());

        System.out.println("Mario Rossi account balance is " + acc1.getBalance());
        System.out.println("Luigi Bianchi account balance is " + acc2.getBalance());
    }
}