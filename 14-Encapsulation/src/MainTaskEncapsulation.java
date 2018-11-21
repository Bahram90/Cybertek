
public class MainTaskEncapsulation {

	public static void main(String[] args) {
		
		TaskEncapsulation mikeAccount=new TaskEncapsulation();
		
		
		mikeAccount.deposit(5553);
		
		mikeAccount.setBalance(2.5);
		
		double balance1=mikeAccount.getBalance();
		System.out.println("Your Account balance is: "+balance1);
		mikeAccount.setCustomerName("Mike");
		
		mikeAccount.withdrawal(100.0);
		
		mikeAccount.deposit(150.000);
		System.out.println("Your Deposit balance is: "+mikeAccount.getBalance());
		System.out.println("Your New Account balance is: "+mikeAccount.getBalance());
		mikeAccount.withdrawal(50.0);
		
		System.out.println(mikeAccount.getCustomerName());
		
		
		
		
		

	}

}
