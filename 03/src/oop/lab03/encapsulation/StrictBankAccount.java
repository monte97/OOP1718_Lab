package oop.lab03.encapsulation;

import oop.lab03.interfaces.BankAccount;

public class StrictBankAccount implements BankAccount{

	private static double ATM_TRANSACTION_FEE = 1;
	private static double FEE_PER_TRANSACTION = 0.1;

    private final int usrID;
    private double balance;
    private int nTransaction;
    
    /*Constructor*/
    
    public StrictBankAccount(final int usrId, final double initAmount) {
    	this.usrID = usrId;
    	this.balance = initAmount;
    }
    
	@Override
	public void withdraw(int usrID, double amount) {
		if (possibleWithdraw(usrID, amount)) {
			balance -= amount;
			nTransaction++;
		} 
		
	}

	@Override
	public void deposit(int usrID, double amount) {
		// TODO Auto-generated method stub
		if (possibleDeposit(usrID, amount)) {
			balance += amount;
			nTransaction++;
		}
	}

	@Override
	public void depositFromATM(int usrID, double amount) {
		deposit(usrID, amount-ATM_TRANSACTION_FEE);
		
	}

	@Override
	public void withdrawFromATM(int usrID, double amount) {
		withdraw(usrID, amount-ATM_TRANSACTION_FEE);
	}

	@Override
	public void computeManagementFees(int usrID) {
		balance-=BankAccount.MNGT_FEES + (nTransaction * FEE_PER_TRANSACTION);
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public int getNTransactions() {
		return nTransaction;
	}
	
	
	/*Utility*/
    private boolean checkUser(final int id) {
        return this.usrID == id;
    }
    
    private boolean consistentData(final int id, final double amount) {
    	return (checkUser(id) && amount >= 0);
    }
    private boolean possibleDeposit(final int id, final double amount) {
		return (consistentData(id, amount));
	}
   
    private boolean possibleWithdraw(final int id, final double amount) {
		return (consistentData(id, amount) && (balance-amount) >= 0);
	}
}
