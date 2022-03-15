package VehicleProject;

public class MainClass {

	public static void main(String[] args) {
		
		Mustang car1 = new Mustang();
		//set stats for car 1
		car1.setBrand("Ford");
		car1.setModel("M165");
		car1.setName("Mustang");
		car1.setCost(400000);
		
		Ranger car2 = new Ranger();
		// set stats for car 2
		car2.setBrand("Ford");
		car2.setModel("FR165");
		car2.setName("Ford Ranger");
		car2.setCost(350000);
		car2.setWheels(5);
		
		BMWMotorCycle motorCycle1 = new BMWMotorCycle();
		// set stats for motorCycle 1
		motorCycle1.setBrand("BMW");
		motorCycle1.setModel("BM22");
		motorCycle1.setName("BMW Cruiser");
		motorCycle1.setCost(75000);
	
		HondaMotorCycle motorCycle2 = new HondaMotorCycle();
		// set stats for motorCycle 2
		motorCycle2.setBrand("Honda");
		motorCycle2.setModel("H21V2");
		motorCycle2.setName("Honda Striker");
		motorCycle2.setCost(95000);
		
		// print stats for the Mustang car
		System.out.println("See below stats and unique functions of your Mustang: ");
		System.out.println("Brand: " + car1.getBrand());
		System.out.println("Model: " + car1.getmodel());
		System.out.println("Name:" + car1.getName());
		System.out.println("Cost: R" + car1.getCost());
		System.out.println("Number of wheels: " + car1.getWheels());
		// Car hooting
		car1.hoot();
		// Car powerSteering status and end result
		car1.powerSteering(true);
		// Car using iets unique function
		car1.sportMode();
		
		
		// print stats for the Ranger car
		System.out.println("See below stats and unique functions of your Ranger: ");
		System.out.println("Brand: " + car2.getBrand());
		System.out.println("Model: " + car2.getmodel());
		System.out.println("Name:" + car2.getName());
		System.out.println("Cost: R" + car2.getCost());
		System.out.println("Number of wheels: " + car2.getWheels());
		// Car hooting
		car2.hoot();
		// Car powerSteering status and end result
		car2.powerSteering(false);
		// Car using its unique function
		car2.offRoeadMode();
				
		// print stats for the Honda motorCycle
		System.out.println("See below stats and unique functions of your BMW: ");
		System.out.println("Brand: " + motorCycle1.getBrand());
		System.out.println("Model: " + motorCycle1.getmodel());
		System.out.println("Name:" + motorCycle1.getName());
		System.out.println("Cost: R" + motorCycle1.getCost());
		System.out.println("Number of wheels: " + motorCycle1.getWheels());
		// Motorcycle using its unique function
		motorCycle1.cruseMode();
		
		System.out.println("See below stats and unique functions of your Honda: ");
		System.out.println("Brand: " + motorCycle2.getBrand());
		System.out.println("Model: " + motorCycle2.getmodel());
		System.out.println("Name:" + motorCycle2.getName());
		System.out.println("Cost: R" + motorCycle2.getCost());
		System.out.println("Number of wheels: " + motorCycle2.getWheels());
		motorCycle2.powerMode();
		
	}
	

}
