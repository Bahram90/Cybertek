package computer;

public class Case {
	
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Demansions demansions;
	
	public Case(String model, String manufacturer, String powerSupply, Demansions demansions) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.demansions = demansions;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Demansions getDimensions() {
		return demansions;
	}
	
	
	

}
