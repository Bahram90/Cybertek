
public class Dog extends Animal{
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	
	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth,
			String coat) {
		super(name, brain, body, size, weight);//(super) keyword means go to another constructor 
		//super means there is relation between constructor.
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	public void chew() {
		System.out.println("Dog.chew() called");
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
	}
	@Override
	public void eat() {  // eat method perfect example for overriding 
		System.out.println("Dog.eat() called");
		super.eat();
		chew();
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		super.move(50);
	}
	
	
	

}
