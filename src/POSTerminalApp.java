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
		int i;
		int name = 0;
		int type = 0;
		int price = 0;
		
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
			 type = k.nextInt();
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
			}//end type switch
		}//end view switch	
		
		System.out.println();//blank line for visual
		System.out.println("How many bottles would you like to order?:  ");
		int bottles = k.nextInt();
		
		int[][][] wine = new int[name][type][price];
		int x = 0;
		double sum = 0.00;
		for(i = 0; i <= wine.length - 1; i++){//begin for loop to place order
			sum = x +1;
		}//sets number of times to prompt order
		System.out.println("Enter bottle " + (i +1)+ ":  ");
		
		
		
	}//psmv

}//end class
