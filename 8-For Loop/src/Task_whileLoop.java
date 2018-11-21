//TASK
//▪ Write a method with the name sumDigits that has one int parameter called number.
//▪ If parameter is >= 10 then the method should process the number and return sum of all
//digits, otherwise return -1 to indicate an invalid value.
//▪ The numbers from 0-9 have 1 digit so we don’t want to process them,
//also we don’t want to process negative numbers, so also return -1 for negative numbers.
//▪ Sample Outputs
//▪ sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
//▪ sumDigits(1) should return -1 as per requirements described above.
//▪ Hint:
//Use n % 10 to extract the least-significant digit. 
//Use n = n / 10 to discard the least-significant digit.

public class Task_whileLoop {

	public static void main(String[] args) {
		System.out.println(sumDigit(125));
		System.out.println(sumDigit(-125));
		System.out.println(sumDigit(32125));
	}
	public static int sumDigit(int number) {
		if(number<10) {
			return -1;
		}
		
		int sum=0;
		while(number>0) {
			int digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
		return sum;
		
	
	}
}
