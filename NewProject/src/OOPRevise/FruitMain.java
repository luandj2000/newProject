package OOPRevise;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple();
		apple.setFruit("Apple");
		apple.stats();
		System.out.println("Color: " + apple.color);
		System.out.println("Price:" + apple.price);
		apple.eat();
		
		System.out.println();
		
		Spinach spinach = new Spinach();
		spinach.setFruit("Spinach");
		spinach.setFruit(false);
		spinach.stats();
		System.out.println("Color: " + spinach.color);
		System.out.println("Price: " + spinach.price);
		spinach.eat();
	}

}
