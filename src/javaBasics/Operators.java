package javaBasics;

public class Operators {
	
	public static void main(String[] args) {
		
		String newLine = System.getProperty("line.separator");
		
		System.out.println("Assignment Operators:");
		Assignment_Operators();
		
		System.out.println(newLine + "Arithmetic Operators:");
		Arithmetic_Operators();
		
		System.out.println(newLine + "Relational Operators:");
		Relational_Operators();
		
		System.out.println(newLine + "Logical Operators:");
		Logical_Operators();
		
		System.out.println(newLine + "Conditional Operators:");
		// variable = (expression) ? value if true : value if false
		Conditional_Operators();

	}

	private static void Conditional_Operators() {
		
		int Ten = 10;	
		int Twenty = 20;
		int Thirty = 30;
	    boolean bValue;
	    int iValue;

	    bValue = (Thirty == Twenty + Ten) ? true: false;
	    System.out.println( "The boolean value of the variable 'bValue' is : " +  bValue ); //true

	    iValue = ((Thirty == Twenty + Ten)) ? 50: 100;
	    System.out.println( "The int Value of the variable iValue is : " + iValue ); //50

	    //This is a use of Not Logical Operator
	    iValue = (!(Thirty == Twenty + Ten)) ? 50: 100;
	    System.out.println( "The int Value of the variable iValue is : " + iValue ); //100
		
	}

	private static void Logical_Operators() {
		
		boolean Output_1 = true;
		boolean Output_2 = false;
		System.out.println("Check if both the boolean variables are true : " + (Output_1 && Output_2));
		System.out.println("Check if even one of the boolean varibale is true : " + (Output_1 || Output_2));
		System.out.println("Change the state of the Output_1 to false : " + (!Output_1));
		
	}

	private static void Relational_Operators() {

		int Ten = 10;	
		int Twenty = 20;
		int Thirty = 30;

		System.out.println("<<<<<< GREATER THAN OPERATOR >>>>>>");
		System.out.println(" Ten > Twenty ==> " + (Ten > Twenty)); //false
		System.out.println(" Twenty > Ten ==> " + (Twenty > Ten)); //true
		System.out.println(" Thirty > Twenty ==> " + (Thirty > Twenty)); //true

		System.out.println("<<<<<< GREATER THAN OR EQUAL TO OPERATOR >>>>>>");
		System.out.println(" Ten >= Twenty ==> " + (Ten >= Twenty)); //false
		System.out.println(" Twenty >= Ten ==> " + (Twenty >= Ten)); //true
		System.out.println(" Thirty >= Twenty ==> " + (Thirty >= Twenty)); //true

		System.out.println("<<<<<< LESS THAN OPERATOR >>>>>>");
		System.out.println(" Ten < Twenty ==> " + (Ten < Twenty)); //true
		System.out.println(" Twenty < Ten ==> " + (Twenty < Ten)); //false
		System.out.println(" Thirty < Twenty ==> " + (Thirty < Twenty)); //false

		//less than or equal to
		System.out.println("<<<<<< LESS THAN OR EQUAL TO OPERATOR >>>>>>");
		System.out.println(" Ten <= Twenty ==> " + (Ten <= Twenty)); //true
		System.out.println(" Twenty <= Ten ==> " + (Twenty <= Ten)); //false
		System.out.println(" Thirty <= Twenty ==> " + (Thirty <= Twenty)); //false

		//equal to
		System.out.println("<<<<<< EQUAL TO OPERATOR >>>>>>");
		System.out.println(" Ten == Twenty ==> " + (Ten == Twenty)); //false
		System.out.println(" Thirty == Twenty + Ten ==> " + (Thirty == Twenty+Ten)); //true

		//not equal to
		System.out.println("<<<<<< NOT EQUAL TO OPERATOR >>>>>>");
		System.out.println(" Ten != Twenty ==> " + (Ten != Twenty)); //true
		System.out.println(" Thirty != Twenty + Ten ==> " + (Thirty != Twenty + Ten)); //false
		
	}

	private static void Arithmetic_Operators() {
		
		int a, b = 10, c = 5;
		a = b + c;
		System.out.println("Value of 'a' after '+' Arithmetic operation is " + a);
		a = b - c;
		System.out.println("Value of 'a' after '-' Arithmetic operation is " + a);
		a = b * c;
		System.out.println("Value of 'a' after '*' Arithmetic operation is " + a);
		a = b / c;
		System.out.println("Value of 'a' after '/' Arithmetic operation is " + a);
		a = b % c;
		System.out.println("Value of 'a' after '%' Arithmetic operation is " + a);
		b++;
		System.out.println("Value of 'b' after '++' Arithmetic operation is " + b);
		c--;
		System.out.println("Value of 'c' after '--' Arithmetic operation is " + c);
		
	}

	private static void Assignment_Operators() {
		
		int speed = 80;
		int distance = 20;
		int time = 10;
		String name = "QA";
		boolean isGood = true;

		System.out.println("Value stored in the speed variable is : " + speed);
		System.out.println("Value stored in the distance variable is : " + distance);
		System.out.println("Value stored in the time variable is : " + time);
		System.out.println("Value stored in the name variable is : " + name);
		System.out.println("Value stored in the isGood variable is : " + isGood);

		speed = 100; // Previous value of speed is overwritten with 100
		time = distance; // Previous value of time is overwritten with distance value
		name = "TestQA"; // Previous value of name is overwritten with TestQA
		isGood = false; // Previous value of isGood is overwritten with false
		System.out.println("Value stored in the speed variable is : " + speed);
		System.out.println("Value stored in the time variable is : " + time);
		System.out.println("Value stored in the name variable is : " + name);
		System.out.println("Value stored in the isGood variable is : " + isGood);

		//Multiple Assignments
		speed = distance = 0; // 100 (20 = 0) 
		System.out.println("Value stored in the speed variable is : " + speed);
		
	}

}
