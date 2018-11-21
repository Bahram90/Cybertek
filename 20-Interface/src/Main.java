
public class Main {

	public static void main(String[] args) {
		
//		DeskPhone mikePhone=new DeskPhone(454757655, true);
		
		ITelephone mikePhone=new DeskPhone(454757655, true);
		mikePhone.powerOn();
		mikePhone.callPhone(454757655);
		mikePhone.answer();
		
		

	}

}
