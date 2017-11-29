package javaBasics;

public class Loops {

	public static void main(String[] args) {

		String newLine = System.getProperty("line.separator");

		// This executes a statement for a particular number of times
		System.out.println("The for Loop:");
		For_Loop();

		// This helps in coming out of the loop
		System.out.println(newLine + "The break Keyword:");
		Break_Loop();

		// This helps in skipping a condition in the loop
		System.out.println(newLine + "The continue Keyword:");
		Continue_Loop();

		// This executes a statement for an unknown number of times
		System.out.println(newLine + "The while Loop:");
		While_Loop();

		// This executes a statement at least for one time
		System.out.println(newLine + "The do while Loop:");
		DoWhile_Loop();

		// This for loop also works with array of any types
		// for (data_type variable: array_name)
		System.out.println(newLine + "Enhanced for loop in Java:");
		Enhanced_Loop();

	}

	private static void Enhanced_Loop() {

		// Array of String storing days of the week
		String days[] = { "Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun" };

		// Enhanced for loop, this will automatically iterate on the array list
		for (String dayName : days) {
			System.out.println("Days ==> " + dayName);
		}

		System.out.println("<==== Normal For Loop ====>");
		// Normal for loop
		for (int i = 0; i < days.length; i++) {
			System.out.println("Days ==> " + days[i]);
		}

	}

	private static void DoWhile_Loop() {

		int Count = 0;
		// This will print -- 5,10,15,20,25
		do {
			Count = Count + 5;
			System.out.println("Count is ==> " + Count);
		} while (Count < 25);

		int CountOnce = 25;
		System.out.println("<==== Next Count ====>");
		// This will just print once
		do {
			CountOnce = CountOnce + 5;
			System.out.println("Count is ==> " + CountOnce);
		} while (CountOnce < 25);

	}

	private static void While_Loop() {

		int Count = 0;
		// This will print -- 5,10,15,20,25
		while (Count < 25) {
			Count = Count + 5;
			System.out.println("Count is ==> " + Count);
		}

		int CountOnce = 25;
		System.out.println("<==== Next Count ====>");
		// This will not print count even once
		while (CountOnce < 25) {
			CountOnce = CountOnce + 5;
			System.out.println("Count is ==> " + CountOnce);
		}

	}

	private static void Continue_Loop() {

		// This will print -- 0,1,2,4,5
		for (int Count = 0; Count <= 5; Count++) {
			if (Count == 3) {
				continue;
			}
			System.out.println("Count is ==> " + Count);
		}

		// This will just print -- 3
		System.out.println("<==== Next Count ====>");
		for (int Count = 0; Count <= 5; Count++) {
			if (Count == 3) {
				System.out.println("Count is ==> " + Count);
				continue;
			}
		}

	}

	private static void Break_Loop() {

		for (int Count = 0; Count <= 10; Count++) {
			if (Count == 6) {
				break;
			}
			System.out.println("Count is ==> " + Count);
		}
		System.out.println("You have exited the loop");
	}

	private static void For_Loop() {

		for (int Increment = 0; Increment <= 5; Increment++) {
			System.out.println("Count is  ==> " + Increment);
		}

		System.out.println("<==== Next Count ====>");
		for (int Decrement = 5; Decrement >= 0; Decrement--) {
			System.out.println("Count is ==> " + Decrement);
		}

		System.out.println("<==== Next Count ====>");
		for (int Increment = 0; Increment <= 5; Increment += 2) {
			System.out.println("Skip every one another  ==> " + Increment);
		}

	}

}
