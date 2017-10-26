package oop.lab03.encapsulation;

public final class TestSimpleBankAccount {

    private TestSimpleBankAccount() { }
    
    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1 2) Creare
         * l' AccountHolder relativo a Luigi Bianchi con id 2 3) Creare i due
         * SimpleBankAccount corrispondenti 4) Effettuare una serie di depositi e
         * prelievi 5) Stampare a video l'ammontare dei due conti e verificare
         * la correttezza del risultato 6) Provare a prelevare fornendo un idUsr
         * sbagliato 7) Controllare nuovamente l'ammontare
         */
    	
    	AccountHolder mrAccount = new AccountHolder("Mario", "Rossi", 1);
    	AccountHolder lbAccount = new AccountHolder("Luigi", "Bianchi", 2);
    	SimpleBankAccount mrBank = new SimpleBankAccount(mrAccount.getUserID(), 0);
    	SimpleBankAccount lbBank = new SimpleBankAccount(lbAccount.getUserID(), 0);
    	System.out.println(mrBank.getBalance());
    	
    	
    	mrBank.deposit(lbAccount.getUserID(), 100);
    	mrBank.deposit(mrAccount.getUserID(), 100);
    	
    	System.out.println(mrBank.getBalance());


    	
    }
}