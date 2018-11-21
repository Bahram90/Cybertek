
public class Calculateinterest {

	public static void main(String[] args) {
		// How much is the interest for the amount of 10000 and 2% interesRate
		// How much is the interest for the amount of 10000 and 3% interesRate
		// How much is the interest for the amount of 10000 and 4% interesRate
		// How much is the interest for the amount of 10000 and 5% interesRate
		System.out.println(calculateInterest(10000, 2));
		System.out.println(calculateInterest(10000, 3));
		System.out.println(calculateInterest(10000, 4));
		System.out.println(calculateInterest(10000, 5));
		
		System.out.println("=======================");
		
		for(int i=2;i<6;i++) {
			System.out.println(calculateInterest(10000, i));
		}

	}
	public static double calculateInterest (double amount,double interestRate) {
		return amount * (interestRate/100);
	}

}
