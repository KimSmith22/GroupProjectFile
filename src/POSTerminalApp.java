import java.util.Scanner;

/**
 * 
 */

/**
 * @author Kimberli
 *
 */
public class POSTerminalApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//variables
		
		//welcome and prompts
		System.out.println("Welcome to our Wine Shop!");
		System.out.println();
		
		System.out.println("Press 1 to view entire inventory or 2 to view by category");
		Scanner k = new Scanner(System.in);
		int view = k.nextInt();
		
		switch(view){//view inventory switch
		case 1:
			System.out.println("inventory list");
			break;
		case 2:
			System.out.println("Select 1 for Pino Noir, 2 for Merlot, 3 for Reisling, and 4 for Moscado");
			int type = k.nextInt();
				switch(type){
				case 1:
					System.out.println("pino noir list");
					break;
				case 2:
					System.out.println("merlot list");
					break;
				case 3:
					System.out.println("reisling list");
					break;
				case 4:
					System.out.println("moscado list");
					break;
					
			System.out.println();//blank line for visual
					
					
			}//end type switch
		}//end view switch
	}//psmv

}//end class
