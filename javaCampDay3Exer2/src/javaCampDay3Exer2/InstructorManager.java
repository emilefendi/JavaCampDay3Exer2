package javaCampDay3Exer2;

public class InstructorManager extends Instructor {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" "+
	"Instructor added!");
	}
	public void remove(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()
		+" "+"instructor removed");
	}
	public void login(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()
		+" "+"instructor loged to system!");
	}
	public void logOut(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()
		+" "+"instructor log out!");
	}

}
