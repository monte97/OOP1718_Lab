class Student {

    // ... Aggiungere qui la definizione dei campi
	private String nome;
	private String cognome;
	private Integer id;
	private Integer matriculationYear;
	
    void build(String nome, String cognome, Integer id, Integer matriculationYear) {
        // ... Inizializzazione dei campi della classe
		this.nome = nome;
		this.cognome = cognome;
		this.id = id;
		this.matriculationYear = matriculationYear;
    }

    void printStudentInfo() {
		System.out.println("Nome: " + this.nome + " Cognome: " + this.cognome  + " id: " + this.id + " matriculationYear: " + this.matriculationYear);
    }
}
