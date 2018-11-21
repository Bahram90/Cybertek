
public class StaticTest {
	
	private static int numInstance=0; //with static method if change object value same time it will effect to class value too
	//private  int numInstance=0; //without  static method if change object value  it will not effect to class value 
	private String name;
	
	public StaticTest(String name) {
		this.name=name;
		numInstance++;
	}
	
	public int getNumInstance() {
		return numInstance;
	}
	
	public String getName() {
		return name;
	}

}
