import java.util.Scanner;

//for all classes 
//import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
//		System.out.println("Enter a byte value");
//		byte b1=scanner.nextByte();
//		//System.out.println("My byte value is "+b1);
//		
//		
//		System.out.println("Enter a short value");
//		short s1= scanner.nextShort();
//		
//		System.out.println("Enter a int value");
//		int i1=scanner.nextInt();
//		
//		System.out.println("Enter a boolean value");
//        boolean bool=scanner.nextBoolean(); 
//        
       System.out.println("Enter a double value");
        double d1=scanner.nextDouble();
//        
//	   System.out.println(b1+"|"+s1+"|"+i1+"|"+bool+"|");
		
//		for combine both of them before to write should put in the new line 
//		(int+String,char+String;byte+String;short+String)=> scanner.nextLine();
		
		scanner.nextLine();
		
		System.out.println("Enter your name");
		String str=scanner.nextLine();
		
		System.out.println(str);
		
		//for closing object  scanner.close();
		
		scanner.close();
	}

}
