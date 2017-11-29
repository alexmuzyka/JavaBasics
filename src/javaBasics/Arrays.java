package javaBasics;

public class Arrays {

	public static void main(String[] args) {

		String newLine = System.getProperty("line.separator");

		System.out.println("Accessing Array values:");
		Array();

		System.out.println(newLine + "Passing an Array to a Method:");
		Passing_Array();

		System.out.println(newLine + "Returning an Array from a Method:");
		Returning_Array();

	}

	private static void Returning_Array() {

		String[] aMake = ReturnArray();
		for (int i = 0; i <= aMake.length - 1; i++) {
			System.out.println("Printing all the values of an Array ==> " + aMake[i]);
		}
	}

	// This method returns an Array of type String
	public static String[] ReturnArray() {
		String[] aArray = { "BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA" };
		return aArray;
	}

	private static void Passing_Array() {

		// Declaring an Array
		String[] aMake = { "BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA" };
		// Calling Print Array method and passing an Array as a parameter
		Print_Array(aMake);

	}

	// This accept Array as an argument of type String
	public static void Print_Array(String[] array) {

		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println("Printing all the values of an Array ==> " + array[i]);
		}

	}

	private static void Array() {

		String[] aMake = { "BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA" };

		int iLength = aMake.length;
		System.out.println("Length of the Array is ==> " + iLength);

		String sBMW = aMake[0];
		System.out.println("First value of the Array is ==> " + sBMW);

		// This is to access the last element of an Array
		String sHonda = aMake[iLength - 1];
		System.out.println("Last value of the Array is ==> " + sHonda);

		// This is to print all the element values of an Array
		for (int i = 0; i <= iLength - 1; i++) {
			System.out.println("The value stored at position " + i + " in aMake array is ==> " + aMake[i]);
		}

	}

}
