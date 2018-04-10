package carPackage;
 
public class CarClass { 
	public String manufacturerName;
	private String modelName;
	private String carKeyValue; 
	public int engineCC ;
	private float fuelAmount;
	final private float amountOfFuelConsumedPerSecond=0.02f;
	
	//constructore 
	public CarClass() {
	    manufacturerName = new String();
	    modelName = new String();
	    engineCC  = 1000;
	    fuelAmount= 0;	
	}
	//constructore
	public CarClass( String carName){
	    manufacturerName = new String(carName);
	    modelName = new String();
	    engineCC  = 0;
	    fuelAmount= 0;	
	}
	
	public CarClass(String manu,String model,String key,int engineCC,float fuel ){
		manufacturerName = manu;
		modelName = model;
		this.engineCC =engineCC;
		fuelAmount = fuel;
		carKeyValue = key;
	}
	
	//methods
	
	public float  presentAmountOfFuel() {
		return fuelAmount; 	
	}
	
	public String getManufacturerName() {
		return manufacturerName; 
	}
	
	public String getModelName(){
		return modelName;
	}
	
	public void addFuel(float fuelAmount) {
		this.fuelAmount+=fuelAmount;
	}
	
	public void runforSeconds(int timeInSecond) {
		float usedFuel =timeInSecond*amountOfFuelConsumedPerSecond;
		fuelAmount-=usedFuel;
	}
	
	public boolean matchPassword(String userInput) {
		return userInput.equals(carKeyValue);
	}
}