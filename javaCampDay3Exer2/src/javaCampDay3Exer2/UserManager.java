package javaCampDay3Exer2;

public class UserManager extends User {
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()
		+" "+"user added");
	}
	public void remove(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()
		+" "+"user removed");
	}
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()
		+" "+"user logged");
	}
	public void logOut(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()
		+" "+"user log out");
	}
	
}
