package carPackage;

import java.awt.Color;

public class MainClass {
	
    private int aNumber = 12 ;
    private int anotherNumber;
    static private CarClass ourCar = new CarClass();
    static private CarClass ourAnotherCar;
    
	public static void main(String[] args) {
	
		CarClass thirdCar = new CarClass("MAZDA","Axela","asdf",1000,20);
		
		SubCarClass ourSubCar = new SubCarClass("BMW","7 Series","xhkhf",3000,25,10, "grey");
		
		ourAnotherCar = new CarClass("TOYOTA","Allion","k9agm3fih",1500,30);
		
		//another car---------------------------------------------------------------------
        System.out.println("Manufacturer : "+ourAnotherCar.manufacturerName);
        System.out.println("Model Name : "+ourAnotherCar.getModelName());
        System.out.println("Password Match : "+ourAnotherCar.matchPassword("sk9agm3fih"));
        System.out.println("First car CC :"+ourAnotherCar.engineCC);
        System.out.println("Amount of Fuel : "+ourAnotherCar.presentAmountOfFuel()+" L");
        
        ourAnotherCar.addFuel(2);
        System.out.println("Amount of Fuel after adding 2L : "+ourAnotherCar.presentAmountOfFuel()+" L");
	    
        ourAnotherCar.runforSeconds(60);
        System.out.println("Amount of Fuel after driving for 60seconds: "+ourAnotherCar.presentAmountOfFuel()+" L");
        System.out.println("\n");
        
        //Third car------------------------------------------------------------------------
        System.out.println("Manufacturer : "+thirdCar.manufacturerName);
        System.out.println("Model Name : "+thirdCar.getModelName());
        System.out.println("Password Match : "+thirdCar.matchPassword("sk9agm3fih"));
        System.out.println("Thrid car CC :"+thirdCar.engineCC);
        System.out.println("Amount of Fuel : "+thirdCar.presentAmountOfFuel()+" L");
        
        thirdCar.addFuel(2);
        System.out.println("Amount of Fuel after adding 2L : "+thirdCar.presentAmountOfFuel()+" L");
	    
        thirdCar.runforSeconds(60);
        System.out.println("Amount of Fuel after driving for 60seconds: "+thirdCar.presentAmountOfFuel()+" L");
        System.out.println("\n");
        
        
      //SubCar-------------------------------------------------------------------------------
        System.out.println("Manufacturer : "+ourSubCar.manufacturerName);
        System.out.println("Model Name : "+ourSubCar.getModelName());
        System.out.println("Password Match : "+ourSubCar.matchPassword("sk9agm3fih"));
        System.out.println("Thrid car CC :"+ourSubCar.engineCC);
        System.out.println("Amount of Fuel : "+ourSubCar.presentAmountOfFuel()+" L");
        
        ourSubCar.addFuel(2);
        System.out.println("Amount of Fuel after adding 2L : "+ourSubCar.presentAmountOfFuel()+" L");
	    
        ourSubCar.runforSeconds(60);
        System.out.println("Amount of Fuel after driving for 60seconds: "+ourSubCar.presentAmountOfFuel()+" L");
       
        System.out.println("Charge in Battery :"+ourSubCar.getChargeInBattery());
        System.out.println("Color of the car : "+ourSubCar.getColorString());
	}

}