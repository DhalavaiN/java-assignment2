package assignment2;

public class main {
	public static void main(String args[]) {
		cat obj=new cat("Kitty");
		dog dobj=new dog("tommy");
		bigdog bdobj=new bigdog("Doberman");
		obj.greets();
		dobj.greets();
		dog d1obj=new dog("Mark");
		d1obj.greets();
		bigdog bd1obj=new bigdog("German Shepherd");
		bdobj.greets();
		bdobj.greets(dobj);
		bd1obj.greets(bdobj);
	}
}
