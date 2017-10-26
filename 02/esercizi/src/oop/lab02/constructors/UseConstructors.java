package oop.lab02.constructors;

public class UseConstructors {

    public static void main(final String[] args) {
        /*
         * 1) Creare lo studente Mario Rossi, matricola 1014, anno
         * immatricolazione 2013
         * 
         * 2) Creare lo studente Luca Bianchi, matricola 1018, anno
         * immatricolazione 2010
         * 
         * 3) Creare lo studente Peppino Vitiello, matricola 1019, anno
         * immatricolazione 2012
         * 
         * 4) Creare lo studente Luca Verdi, matricola 1020, anno
         * immatricolazione 2013
         * 
         * 5) Creare un treno con 300 posti di cui 100 in prima classe 200 in
         * seconda classe
         * 
         * 6) Creare un treno con 1100 posti di cui 50 in prima classe 1050 in
         * seconda classe
         * 
         * 7) Creare un treno con 500 posti, tutti di seconda classe
         * 
         * 8) Creare un treno con numero di posti di default
         * 
         * 9) Per verificare la correttezza dei costruttori implementati
         * stampare a video le informaizioni relative agli studenti (metodo
         * printStudentInfo) e ai treni (a tal fine implementare un metodo
         * printTrainInfo nella classe Train). Verificare che il numero di posti
         * di default sia consistente (ossia che ci sia un numero positivo di
         * posti totali, e che la somma dei posti in prima e seconda classe dia
         * il totale dei posti sul treno).
         */
		 
		Student studente1 = new Student("Mario", "Rossi", 1014, 2013);
		Student studente2 = new Student("Luca", "Bianchi", 1018, 2010);
		Student studente3 = new Student("Luca", "Verdi", 1019, 2012);
		
		Train train1 = new Train(100, 200);
		Train train2 = new Train(50, 1050);
		Train train3 = new Train(0, 500);
		
		studente1.printStudentInfo();
		studente2.printStudentInfo();
		studente3.printStudentInfo();
		
		train1.printTrainInfo();
		train2.printTrainInfo();
		train3.printTrainInfo();
		
		
		
    }
}
