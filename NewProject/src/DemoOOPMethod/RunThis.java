package DemoOOPMethod;

public class RunThis {

	static void myMethod() {
		
		System.out.println("Hello World");
	}
	
	public void myPublicMethod() {
		System.out.println("Public mdthod must be called by creating objects.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	myMethod();	
	RunThis rt = new RunThis();
	rt.myPublicMethod();
	}

}
