package carPackage;

public class SubCarClass extends CarClass{
   
	private float chargeInBattery;
	private String colorString;
	public SubCarClass() {
		super();
	}
	
	public SubCarClass(String manu, String model, String key, int Cc, float fl, float charge, String col) {
		super(manu,model,key,Cc,fl);
		chargeInBattery = charge;
		colorString = col;
	}
	
	
	public float getChargeInBattery() {
		return chargeInBattery;
	}
	public void setChargeInBattery(float chargeInBattery) {
		this.chargeInBattery = chargeInBattery;
	}


	public String getColorString() {
		return colorString;
	}

}