package VehicleProject;

public class Car extends Vehicle {

	private int wheels = 4;
	
	public void hoot() {
		System.out.println("Hoot Hoot!!");
	}
	
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public void powerSteering(boolean powerSteering) {
		if (powerSteering == true) {
			System.out.println("You made the turn safely");
		}else {
			System.out.println("You crashed into a ditch");
		}
	}
}
