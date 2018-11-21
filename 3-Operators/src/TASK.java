

//1-create a double variable with the value 20
//2-create a second variable of type double with the value 80
//3-add both numbers up and multiply by 25
//4-Use the remainder operator to figure out the remainder from the sum 0
//5-Print  remaning total (#4)is equal to 20 or less:true/false

public class TASK {

	public static void main(String[] args) {
		
		double d1 = 20.0;
		double d2 = 80.0;
		
		double res1 = (d1 + d2) * 25;
		
		double res2 = res1%40;
		System.out.println(res2);
		if(res2 <= 20 ) {
		System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
