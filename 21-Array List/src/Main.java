import java.util.*;



public class Main {
	
	private static Scanner scanner=new Scanner(System.in);
	private static GroceryList groceryList=new GroceryList();
	

	public static void main(String[] args) {
		
		boolean quit=false;
		int choice=0;
		printInstrunctions();
		while(!quit) {
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			switch(choice) {
			case 0:
				printInstrunctions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit=true;
				break;
				
			}
		}
		

	}


	private static void searchForItem() {
		// TODO Auto-generated method stub
		
	}


	private static void removeItem() {
		// TODO Auto-generated method stub
		
	}


	private static void modifyItem() {
		// TODO Auto-generated method stub
		
	}


	private static void addItem() {
		// TODO Auto-generated method stub
		
	}


	private static void printInstrunctions() {
		// TODO Auto-generated method stub
		
	}

}
