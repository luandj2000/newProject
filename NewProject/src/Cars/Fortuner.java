package Cars;

public class Fortuner {

	static void welcome() {
		System.out.println("Welcome to 2022s Automation Testing class");
	}
	
	static void goodBye() {
		System.out.println("Thank you for coming and enjoy the rest of your day.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars  car = new Cars();
		car.brand = "Toyota";
		car.fuelCapacity = 60;
		car.warrantyYears = 2;
		
		welcome();
		System.out.println("The car brand is " + car.brand);
		System.out.println("The car's fuel capacity is " + car.fuelCapacity);
		System.out.println("The car's warranty period is " + car.warrantyYears + " years");
		car.drive();
		car.fuelAlert();
		System.out.println("Tire is flat: " + car.isTireFlat());
		goodBye();
		System.out.println();
		
		Cars car2 = new Cars();
		car2.brand = "BMW";
		car2.fuelCapacity = 65;
		car2.warrantyYears = 6;
		
		welcome();
		System.out.println("The car brand is " + car2.brand);
		System.out.println("The car's fuel capacity is " + car2.fuelCapacity);
		System.out.println("The car's warranty period is " + car2.warrantyYears + " years");
		car2.drive();
		car2.fuelAlert();
		System.out.println("Tire is flat: " + car2.isTireFlat());
		goodBye();
		System.out.println();
		
		Cars car3 = new Cars();
		car3.brand = "Ford";
		car3.fuelCapacity = 75;
		car3.warrantyYears = 5;
		
		welcome();
		System.out.println("The car brand is " + car3.brand);
		System.out.println("The car's fuel capacity is " + car3.fuelCapacity);
		System.out.println("The car's warranty period is " + car3.warrantyYears + " years");
		car3.drive();
		car3.fuelAlert();
		System.out.println("Tire is flat: " + car3.isTireFlat());
		goodBye();
		/*
		Cars [] carAll = new Cars[4];
		
		carAll[0] = new Cars();
		carAll[0].brand = "Toyota";
		carAll[0].fuelCapacity = 60;
		carAll[0].warrantyYears = 2;
		
		carAll[1].brand = "BMW";
		carAll[1].fuelCapacity = 65;
		carAll[1].warrantyYears = 6;
		*/
	}

}
