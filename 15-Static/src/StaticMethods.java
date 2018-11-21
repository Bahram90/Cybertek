
public class StaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc.show1();
		Abc.show4();
		
		Abc x=new Abc();
		x.show2();
	
	}

}


class Abc{
	
	public static void show1() {
		System.out.println("hi");
		//show2(); //not able to call public void inside of static method
		show4();
	}
	
	public void show2() {
		System.out.println("hi");
		show1();
	}
	
	public void show3() {
		System.out.println("hi");
		show2();
		show1();
	}
	
	public static void show4() {
		System.out.println("hi");
	}
}