import java.util.Arrays;

public class ReferenceClass {

	public static void main(String[] args) {
		int myIntValue=10;
		int anotherIntValue=myIntValue;
		
		System.out.println("myIntValue: "+myIntValue);
		System.out.println("anotherIntValue: "+anotherIntValue);
		
		anotherIntValue=myIntValue+1;
		
		System.out.println("myIntValue: "+myIntValue);
		System.out.println("anotherIntValue: "+anotherIntValue);	
		
		System.out.println("====================");
		
		int[] myIntArray= new int[5];
		int[] anotherArray=myIntArray;
		
		System.out.println("myIntValue: "+Arrays.toString(myIntArray));
		System.out.println("anotherIntValue: "+Arrays.toString(anotherArray));
		
		anotherArray[0]=1;
		
		System.out.println("myIntValue: "+Arrays.toString(myIntArray));
		System.out.println("anotherIntValue: "+Arrays.toString(anotherArray));
		
		

	}

}
