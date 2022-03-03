package newPackage;

public class MethodsDemo {
	
	static void demoMethod() {
		//code to be executed
		System.out.println("This is in demo Method");	
		}
	static void demoMethod(String fName) {
	//code to be executed
	System.out.println(fName + " :This is in demo Method");	
	}
	

	public static void main(String[] args) {
		System.out.println("This is in the Main Method");
		demoMethod("Ping");
		demoMethod("Pong");
		demoMethod("King");
		demoMethod("Kong");
		demoMethod("Boom");
	}

}
