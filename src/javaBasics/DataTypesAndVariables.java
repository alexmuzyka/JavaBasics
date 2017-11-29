package javaBasics;

public class DataTypesAndVariables {

	public static void main(String[] args) {

		String newLine = System.getProperty("line.separator");

		System.out.println("BooleanTestExercise:");
		BooleanTestExercise();

		System.out.println(newLine + "IntegerTestExersice:");
		IntegerTestExersice();

		System.out.println(newLine + "CharTestExercise:");
		CharTestExercise();
		
		System.out.println(newLine + "DoubleTestExercise:");
		DoubleTestExercise();
		
		

	}

	private static void DoubleTestExercise() {

		double PI;
        PI = Math.PI;
        System.out.print("PI: " + PI);
		
	}

	private static void CharTestExercise() {

		char a;
		a = 'P';
		System.out.println("Value of char is : " + a);

	}

	private static void IntegerTestExersice() {

		int carSpeed;
		carSpeed = 20;
		System.out.println("Car is running at the speed of: " + carSpeed);
		carSpeed = carSpeed + 20;
		System.out.println("Current speed of the car is: " + carSpeed);

	}

	private static void BooleanTestExercise() {

		boolean testResult;

		testResult = true;
		System.out.println("Test Result is: " + testResult);
		testResult = false;
		System.out.println("Test Result is: " + testResult);

	}

}
