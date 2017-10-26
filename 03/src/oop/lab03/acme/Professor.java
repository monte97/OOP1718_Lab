package oop.lab03.acme;

public class Professor implements User {
	private final int id;
	private final String name;
	private final String surname;
	private String[] courses;
	
	private String password;
	private String description;
	
	final static String DOT = ".";
	
	public Professor(final int id, final String name, final String surname, final String[] courses, final String password, final String description) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.courses = courses;
		this.password = password;
		this.description = description;
	}
	
	public void replaceCourse(final String newCourse, final int idx) {
		this.courses[idx] = newCourse;
	}
	
	public void replaceAllCoursed(final String[] courses) {
		this.courses = courses;
	}

	@Override
	public String getUsername() {
		return name + DOT + surname;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
