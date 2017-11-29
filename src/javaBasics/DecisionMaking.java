package javaBasics;

public class DecisionMaking {

	public static void main(String[] args) {

		String newLine = System.getProperty("line.separator");

		System.out.println("IfThen Statement:");
		IfThen_Statement();

		System.out.println(newLine + "IfThenElse Statement:");
		IfThenElse_Statement();

		System.out.println(newLine + "IfThenElseIf Statement:");
		IfThenElseIf_Statement();
		
		System.out.println(newLine + "Switch Statement:");
		Switch_Statement();
	}

	private static void Switch_Statement() {
		
		int iDay = 1;
		String sDay = "Monday";

 		switch(iDay){
 			case 1:
 				System.out.println("Today is Monday");
 				break;
			case 3:
				System.out.println("Today is Tuesday");
				break;
			case 4:
				System.out.println("Today is Wednesday");
				break;
			case 5:
				System.out.println("Today is Thursday");
				break;
			case 6:
				System.out.println("Today is Friday");
				break;
			case 7:
				System.out.println("Today is Saturday");
				break;
			default:
				System.out.println("Today is Sunday");
				break;
 				}

 		switch(sDay){
			case "Monday":
				System.out.println("Today is Monday");
				break;
			case "Tuesday":
				System.out.println("Today is Tuesday");
				break;
			case "Wednesday":
				System.out.println("Today is Wednesday");
				break;
			case "Thursday":
				System.out.println("Today is Thursday");
				break;
			case "Friday":
				System.out.println("Today is Friday");
				break;
			case "Saturday":
				System.out.println("Today is Saturday");
				break;
			default:
				System.out.println("Today is Sunday");
				break;
 				}
		
	}

	private static void IfThenElseIf_Statement() {
		
		String sDay = "Monday";
		int iDay = 1;

		if(sDay.equals("Sunday")){
			System.out.println("Today is Sunday");
		}else if(sDay.equals("Saturday")){
			System.out.println("Today is not Saturday");
		}else{
			System.out.println("Today is a Weekday");
		}

		if(iDay==7){
			System.out.println("Today is Sunday");
		}else if(iDay==6){
			System.out.println("Today is Saturday");
		}else{
			System.out.println("Today is a Weekday");
		}
		
	}

	private static void IfThenElse_Statement() {
		
		String sDay = "Saturday";
		int iDay = 6;

		if(sDay.equals("Sunday")){
			System.out.println("Today is Sunday");
		}else{
			System.out.println("Today is not Sunday");
		}

		if(iDay==7){
			System.out.println("Today is Sunday");
		}else{
			System.out.println("Today is not Sunday");
		}
		
	}

	private static void IfThen_Statement() {

		String sDay = "Sunday";
		int iDay = 7;

		if(sDay.equals("Sunday")){
			System.out.println("Today is Sunday");
		}

		if(iDay==7){
			System.out.println("Today is Sunday");
		}
		
	}

}
