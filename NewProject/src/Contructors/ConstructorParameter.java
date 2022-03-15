package Contructors;

public class ConstructorParameter {
	
	int x;
	String constructorName;
	
	public ConstructorParameter(int y, String myName) {
		x = y;
		constructorName = myName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorParameter obj = new ConstructorParameter(5,"Luan");
		System.out.println(obj.x + " " + obj.constructorName);
	}

}
