package oop.lab02.constructors;

public class Student {

    String name;
    String surname;
    int id;
    int matriculationYear;

	student() {
		this.name = "Student.name";
		this.name = "Student.surname"
		this.id = 0;
		this.matriculationYear = 0;
	}
	
	student(String name, String surname, int id, int year){
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.matriculationYear = year;
	}
	
    void printStudentInfo() {
        System.out.println("Student id: " + this.id);
        System.out.println("Student name: " + this.name);
        System.out.println("Student surname: " + this.surname);
        System.out.println("Student matriculationYear: " + this.matriculationYear + "\n");
    }

    
}
