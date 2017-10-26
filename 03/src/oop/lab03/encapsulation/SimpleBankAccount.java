package oop.lab03.encapsulation;

import oop.lab03.interfaces.BankAccount;

public class SimpleBankAccount implements BankAccount{

	private static double ATM_TRANSACTION_FEE = 1;

    private final int usrID;
    private double balance;
    private int nTransaction;
    
    /*Constructor*/
    
    public SimpleBankAccount(final int usrId, final double initAmount) {
    	this.usrID = usrId;
    	this.balance = initAmount;
    }
    
    /*Getter & Setter*/
    public int getUsrID() {
		return usrID;
	}

	public double getBalance() {
		return balance;
	}

	public int getNTransactions() {
		return nTransaction;
	}
	
	/*Methods*/
	public void deposit(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto Nota: il deposito va a buon fine solo se l'id utente
         * corrisponde
         */
		if (amount > 0) {
			doOp(usrID, amount);
		}
		
    }

    public void withdraw(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount al totale del
         * conto. Note: - Il conto puo' andare in rosso (ammontare negativo) -
         * Il prelievo va a buon fine solo se l'id utente corrisponde
         */
    	if (amount > 0) {
    		doOp(usrID, -1 * amount);
    	}
    }

    public void depositFromATM(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto detraendo le spese (costante ATM_TRANSACTION_FEE) relative
         * all'uso dell'ATM (bancomat) Nota: il deposito va a buon fine solo se
         * l'id utente corrisponde
         */
    	this.deposit(usrID, amount - this.ATM_TRANSACTION_FEE);
    }

    public void withdrawFromATM(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount + le spese
         * (costante ATM_TRANSACTION_FEE) relative all'uso dell'ATM (bancomat)
         * al totale del conto. Note: - Il conto puo' andare in rosso (ammontare
         * negativo) - Il prelievo va a buon fine solo se l'id utente
         * corrisponde
         */
    	this.withdraw(usrID, amount - this.ATM_TRANSACTION_FEE);
    }

    /* Utility method per controllare lo user */
    private boolean checkUser(final int id) {
        return this.usrID == id;
    }
    
    private void doOp(final int usrId, final double amount) {
    	if (checkUser(usrId)) {
    		balance += amount;
        	nTransaction++;
    	}
    }

	@Override
	public void computeManagementFees(int usrID) {
		balance-=BankAccount.MNGT_FEES;
	}

}