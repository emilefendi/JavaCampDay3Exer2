package javaCampDay3Exer2;

public class StudentManager extends Student {
	
	public void add(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()
		+" "+"student added.");
	}
	public void remove(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()
		+" "+"student removed");
	}
	public void login(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()
		+" "+"student logged");
	}
	public void logOut(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()
		+" "+"student logged out");
	}

}
