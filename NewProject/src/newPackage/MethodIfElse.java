package newPackage;


public class MethodIfElse {

	static int checkAge(int age, int num) {
		int modAge = age + num;
		if (modAge < 18) {
			System.out.println("Access denied you are not old enough");
		}else {
			System.out.println("Access granted you are old enough.");
		}
		return modAge;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkAge(1,16));
	}

}
