package computer;

public class Monitor {
	
	private String model;
	private String manufacture;
	private int size;
	private Resolution resolution1;
	
	public Monitor(String model, String manufacture, int size, Resolution resolution1) {
		this.model = model;
		this.manufacture = manufacture;
		this.size = size;
		this.resolution1 = resolution1;
	}
	
	public void drawPixelAt(int x,int y,String color) {
		System.out.println("Drwaing pixel at "+x+","+y+" in color "+color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacture() {
		return manufacture;
	}

	public int getSize() {
		return size;
	}

	public Resolution getResolution1() {
		return resolution1;
	}
	
	
	
    
}
