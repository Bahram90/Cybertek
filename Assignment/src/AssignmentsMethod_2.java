
//The cat spend most of the day playing. 
//In particular, they play if the temperature is between 25 and 35(inclusive). 
//Unless it is summer, then the upper limit is 45(inclusive) instead of 35.
//
//Write a method isCatPlaying that has 2 parameters.
//Method needs to return true if cat is playing, otherwise return false.
//First parameter should be of type boolean and be named summer it represents if it is summer.
//Second parameter represents the temperature and is of type int with the name temperature.
//
//Sample Outputs:
//
//isCatPlaying(true,10) = > false
//isCatPlaying(false,36) = > false
//isCatPlaying(false,35) = > true

public class AssignmentsMethod_2 {

	public static void main(String[] args) {
		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));
		System.out.println(isCatPlaying(false, 35));

	}
	public static int isCatPlaying(boolean summer, int temp) {
		if(temp>=25 && temp<=35) {
			System.out.println(summer);
			//return summer;
		}
		else if(temp>=25 && temp<=45 && summer==true){
			System.out.println(summer);
            //return summer;
        }
		else {
			System.out.println(summer);
			//return summer;
		}
		return temp;
		
	}

}
