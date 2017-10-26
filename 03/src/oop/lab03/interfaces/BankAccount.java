package oop.lab03.interfaces;

public interface BankAccount {
	final static double MNGT_FEES = 5;
	
    void withdraw(int usrID, double amount);

    void deposit(int usrID, double amount);

    void depositFromATM(int usrID, double amount);

    void withdrawFromATM(int usrID, double amount);

    void computeManagementFees(int usrID);

    double getBalance();

    int getNTransactions();
}