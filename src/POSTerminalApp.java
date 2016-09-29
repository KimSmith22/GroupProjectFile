import java.util.ArrayList;
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
		
	
		ArrayList<Wine> winelist = new ArrayList<Wine>();
		
		Winelist.add(new Wine(“Villa Alena”, “Moscato”, 6.99));
		Winelist.add(new Wine(“Beviano”, “Mascato”, 9.99));
		Winelist.add(new Wine(“Flip Flop”,  “Mascato”, 10.00));
		Winelist.add(new Wine(“Columbia Valley”, ”Merlot”, 12.00));
		Winelist.add(new Wine(“North Coast”, “Merlot”, 9.99));
		Winelist.add(new Wine(“Mark West”, “ Pinot Noir”, 11.00));
		Winelist.add(new Wine(“DeLoach”, “Pinot Noir”, 18.99));
		Winelist.add(new Wine(“Castle Rock”, ”Pinot Noir”, 8.99));
		Winelist.add(new Wine(“Murphy’s Law”, “Riesling”, 12.99));
		Winelist.add(new Wine(“Washington Hills”, “Riesling”, 10.00));
		Winelist.add(new Wine(“Standing Stone”, “Riesling”, 11.99));
		Winelist.add(new Wine(“Bex”, “Riesling”, 10.99));


		
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
