class TestStudent {
  public static void main(String[] args) {
      Student student = new Student();
      /*
       * aggiornare l'invocazione del metodo build con l'aggiunta dei
       * parametri
       */
      student.build("Luigi","Gentile",1015,2012);
      student.printStudentInfo();
      /*
       * Creare dei nuovi oggetti relativi agli studenti:
       *
       * - Nome: Luigi Cognome: Gentile id: 1015, matriculationYear: 2012 -
       * Nome: Simone Cognome: Bianchi id: 1016, matriculationYear: 2010
       *
       * - Nome: Andrea Cognome: Bracci id: 1017, matriculationYear: 2012
       *
       * Stampare a video le informazioni relative a ciascuno studente.
       */
  }
}
