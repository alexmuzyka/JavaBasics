package javaBasics;

public class ConstructorTestExerciseMain {

	public static void main(String[] args) {

		// Use the Car1 keyword to declare Car1 Class variable
		// Passing values to the constructor
		Car1 Toyota = new Car1("Camry", 2014, true);
		
		// or use default
		Car1 Toyota1 = new Car1();

		Toyota.iDoors = 4;
		Toyota.setiGear(5);
		Toyota.iHighestSpeed = 200;
		Toyota.iTyres = 4;
		Toyota.sColor = "Black";
		Toyota.sTransmission = "Manual";
		
		Toyota1.iDoors = 4;
		Toyota1.setiGear(5);
		Toyota1.iHighestSpeed = 200;
		Toyota1.iTyres = 4;
		Toyota1.sColor = "Black";
		Toyota1.sTransmission = "Manual";

		Toyota.DisplayCharacterstics();
		System.out.println();
		Toyota1.DisplayCharacterstics();

	}

}
