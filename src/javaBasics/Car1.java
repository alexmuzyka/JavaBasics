package javaBasics;

public class Car1 {
	
	//Class Member Variables & Fields
	//Private variables 
    private String sModel;
    private int iMake;
    private int iGear;
    int iHighestSpeed;
    String sColor;
    boolean bLeftHandDrive;
    String sTransmission;
    int iTyres;
    int iDoors;

    //Constructor with values passed
    public Car1(String Model, int Make, boolean LeftHandDrive ){
    	sModel = Model;
    	iMake = Make;
    	bLeftHandDrive = LeftHandDrive;
    }
    
    // or use default
    public Car1(){
    	sModel = "Camry";
    	iMake = 2014;
    	bLeftHandDrive = true;
    }
 
    //Method
    public void DisplayCharacterstics(){
    	System.out.println("Model of the Car: " +  sModel);
    	System.out.println("Number of gears in the Car: " +  getiGear());
    	System.out.println("Max speed of the Car: " +  iHighestSpeed);
    	System.out.println("Color of the Car: " +  sColor);
    	System.out.println("Make of the Car: " +  iMake);
		System.out.println("Transmission of the Car: " + sTransmission);

	}

	public int getiGear() {
		return iGear;
	}

	public void setiGear(int iGear) {
		this.iGear = iGear;
	}

}
