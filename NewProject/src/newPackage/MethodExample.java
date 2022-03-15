package newPackage;

public class MethodExample {

	static void profile(String name, String surname, int age) {
		System.out.println("Hi, my name is: " + name +" " +  surname +" and my age is " + age);
	}
	
	static {
		System.out.println("Surprise all!");
	}
	static int age(String name, String surname, int age) {
		System.out.print("Hi, my name is: " + name +" " +  surname +" and my age is ");
		return age*4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		profile("Luan","de Jager", 100);
		
		int age = age("Luan","de Jager", 100);
		System.out.println(age);
	}

}
