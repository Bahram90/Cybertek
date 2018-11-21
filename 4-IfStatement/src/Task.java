//Write a Java Program for the following logic 
//   1-if marks < 60, then print "Fail"
//   2-if mark >=60, but less than 90,then print "Pass"
//   3- if mark >=90, then print "Passed with Distinction"
public class Task {

	public static void main(String[] args) {
		int mark=78;
		if(mark<60) {
			System.out.println("Fail");
		}else if(mark>=60 && mark<90) {
			System.out.println("Pass");
		}else if(mark>=90) {
			System.out.println("Passed with Distinction");
		}

	}

}
