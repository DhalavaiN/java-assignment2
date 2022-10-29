package assignment2;

public class bigdog extends dog {

	bigdog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override public void greets() {
		System.out.println("woow");
	}
	@Override public void greets(dog obj) {
		System.out.println("Wooooooow");
	}
}
