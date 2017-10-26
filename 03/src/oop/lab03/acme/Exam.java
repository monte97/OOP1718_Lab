package oop.lab03.acme;

import java.util.Arrays;

public class Exam {
	private final int id;
	private int nMaxStudents;
	private int nRegisteredStudents;
	private final String courseName;
	private Student[] registeredStudents;
	private Professor professor;
	private ExamRoom examRoom;
	
	public Exam(final int id, final int nMaxStudent, final String courseName, final Professor professor, final ExamRoom examRoom) {
		this.id = id;
		this.nMaxStudents = nMaxStudent;
		this.nRegisteredStudents = 0;
		this.courseName = courseName;
		this.registeredStudents = new Student[nMaxStudent];
		this.professor = professor;
		this.examRoom = examRoom;
	}
	
	public void registerStudent(final Student student) {
		if (nRegisteredStudents < nMaxStudents) {
			registeredStudents[nRegisteredStudents] = student;
			nRegisteredStudents++;
		}
		
		
	}
	
}
