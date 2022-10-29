package assignment2;

public class dog extends animal {

	dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		}
	@Override public void greets() {
		System.out.println("Woof");
	}
	public void greets(dog obj) {
		System.out.println("Wooooof");
	}
}
