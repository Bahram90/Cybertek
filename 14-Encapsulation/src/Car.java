
public class Car {
	
	private int doors;
	private int wheels;
	private String model;
	private String ingine;
	private String color;
	
	
	
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if(model.equals("911")) {
			this.model = model;
		}else {
			this.model = "invalid";
		}
	}
	public String getIngine() {
		return ingine;
	}
	public void setIngine(String ingine) {
		this.ingine = ingine;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
