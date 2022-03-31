package OOPRevise;

public class Fruits {
	
	String fruit;
	boolean isFruit = true;
	
	public void stats() {
		System.out.println("Fruit: " + fruit + "\n" + "isFruit: " + isFruit);
	}
	
	public void eat() {
		System.out.println("You ate a fruit");
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public boolean isFruit() {
		return isFruit;
	}

	public void setFruit(boolean isFruit) {
		this.isFruit = isFruit;
	}
	
}
