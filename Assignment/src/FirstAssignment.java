
public class FirstAssignment {

	public static void main(String[] args) {
//		    Write a JAVA program to calculate the tax:
//
//			income ≤ 150,000,000 tax ratio %25
//			income ≤ 300,000,000 tax ratio %30
//			income ≤ 600,000,000 tax ratio %35
//			income ≤ 1,200,000,000 tax ratio %40
//			income > 1,200,000,000 tax ratio %50
//
//			Create needed variables and print the tax 
		
		long income=1_500_000_000l;
		double tax=0;
		if(income<=150_000_000) {
			tax=income*0.25;
		}
		/////////
		else if(income<=300_000_000) {
			tax=150_000_000*0.25
					+(300_000_000-150_000_000)*0.30;
		}
		///////////////
		else if(income<=600_000_000) {
			tax=150_000_000*0.25
					+(300_000_000-150_000_000)*0.30
					   +(600_000_000-300_000_000)*0.35;
		}
		//////////
		else if(income<=1.200_000_000) {
			tax=150_000_000*0.25
					+(300_000_000-150_000_000)*0.30
					   +(600_000_000-300_000_000)*0.35
					      +(1_200_000_000-600_000_000)*0.40;
		}
		////////////
		else if(income>=1.200_000_000) {
			tax=150_000_000*0.25
					  +(300_000_000-150_000_000)*0.30
					     +(600_000_000-300_000_000)*0.35
					        +(1_200_000_000-600_000_000)*0.40
					              +(income-1_200_000_000)*0.50;
		}
		//////
		else {

		       System.out.println("It is invalid");

		}
		System.out.println("The tax is : "+ (int)tax );
		
		
	}

}
