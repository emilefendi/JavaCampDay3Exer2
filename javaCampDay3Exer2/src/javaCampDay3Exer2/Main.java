package javaCampDay3Exer2;

public class Main {
	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setInstructorId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setPassword("12345");
		instructor1.seteMail("engindemirog@gmail.com");
		instructor1.setCourse("Java * React");

		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setInstructorId(2);
		instructor2.setFirstName("Mustafa");
		instructor2.setLastName("Murat");
		instructor2.setPassword("45678");
		instructor2.seteMail("muratm@gmail.com");
		instructor2.setCourse("Python");

		Student student1 = new Student();
		student1.setId(1);
		student1.setStudentId(1);
		student1.setFirstName("Emil");
		student1.setLastName("Efendi");
		student1.setPassword("89654");
		student1.seteMail("emilefendi@gmail.com");
		student1.setCourse("Java * React");

		Student student2 = new Student();
		student2.setId(2);
		student2.setStudentId(2);
		student2.setFirstName("Elnur");
		student2.setLastName("Eliyev");
		student2.setPassword("32154");
		student2.seteMail("elnur7@gmail.com");
		student2.setCourse("Python");

		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.remove(instructor2);
		userManager.login(instructor1);
		userManager.logOut(instructor2);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.remove(instructor2);
		instructorManager.login(instructor1);
		instructorManager.logOut(instructor2);

		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.remove(student2);
		studentManager.login(student1);
		studentManager.logOut(student1);

	}
}
