//TASK
//▪ Create a new switch statement using char instead of int.
//▪ Create a new char variable
//▪ Create a switch statement testing for A, B, C, D or E
//▪ Display a message if any of these are found and then break 
//▪ Add a default which displays a message saying not found.

public class Task_Switch {

	public static void main(String[] args) {
		char switchChar='E';
		switch(switchChar) {
		case 'A': case 'B': case 'C': case 'D': case 'E':
			System.out.println(switchChar+" Value is found");
			break;
		
			default:
				System.out.println("Value is not found");
				break;
		
		}

	}

}
