package week2.day1;

public class Car {

	public void driveCar() {

		System.out.println("Drive car");
	}

	protected void applyBrake() {
		System.out.println("Apply Brake");
	}

	private void soundHorn() {

		System.out.println("Sound Horn");

	}
	
	private String brandName(String name){
		
		System.out.println(name);
		name = "Swift";
		return name;
		
		
	}

	boolean isPuncture(boolean var) {

		System.out.println("Is Puncture");
		
		var = true;
		return var;

	}

	public static void main(String[] args) {

		Car obj = new Car();
		obj.driveCar();
		obj.applyBrake();
		obj.soundHorn();
		obj.isPuncture(true);
		obj.brandName("Swift");

	}

}
