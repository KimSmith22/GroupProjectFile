import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * 
 */

/**
 * @author Kimberli
 * 		   Jennifer
 * 		   Daniel
 *
 */
public class POSTerminalApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Wine wine = new Wine();
		// variables
		String choice = "y";
		double total = 0.00;
		
		
		//welcome and prompts

ArrayList<Wine> winelist = new ArrayList<Wine>();
	
	winelist.add(new Wine("Villa Alena\t\t\t", "Moscato\t\t\t$ ", 6.99));
	winelist.add(new Wine("Beviano\t\t\t", "Moscato\t\t\t$ ", 9.99));
	winelist.add(new Wine("Flip Flop\t\t\t",  "Moscato\t\t\t$ ", 9.99));
	winelist.add(new Wine("Columbia Valley\t", "Merlot\t\t\t\t$", 11.99));
	winelist.add(new Wine("North Coast\t\t", "Merlot\t\t\t\t$", 17.99));
	winelist.add(new Wine("Mark West\t\t", "Pinot Noir\t\t\t$", 10.99));
	winelist.add(new Wine("DeLoach\t\t\t", "Pinot Noir\t\t\t$", 8.99));
	winelist.add(new Wine("Castle Rock\t\t", "Pinot Noir\t\t\t$", 12.99));
	winelist.add(new Wine("Murphy’s Law\t\t", "Riesling\t\t\t$", 11.99));
	winelist.add(new Wine("Washington Hills\t", "Riesling\t\t\t$", 7.99));
	winelist.add(new Wine("Standing Stone\t", "Riesling\t\t\t$", 6.99));
	winelist.add(new Wine("Bex\t\t\t\t", "Riesling\t\t\t$", 5.99));
			
				/*	
				List<Double> Price= new ArrayList<Double>();
 Price.add(6.99);
 Price.add(9.99); 
 Price.add(10.00);
 Price.add(12.00);
 Price.add(18.00);
 Price.add(11.00);
 Price.add(8.99);
 Price.add(12.99);
 Price.add(11.99);
 Price.add(7.99);
 Price.add(6.99);
 Price.add(5.99);
 */
		// welcome and prompts

		System.out.println("Welcome to our Wine Shop!");
		System.out.println();

		System.out.println("Press 1 to view entire inventory or 2 to view by category");
		Scanner k = new Scanner(System.in);
		int view = k.nextInt();
		
		switch(view){//view inventory switch

		case 1:
			System.out.printf("Wine Name\t\t\t Type \t\t\t Price\n");
	for (Wine x: winelist) {				
						System.out.println(x);
	}
			break;
		case 2:
			System.out.println("Select:\n1 for Pinot Noir\n2 for Merlot\n3 for Reisling\n4 for Moscato");
			int type = k.nextInt();
				switch(type){
				case 1:
					System.out.println("pinot noir list");
					break;
				case 2:
					System.out.println("merlot list");
					break;
				case 3:
					System.out.println("reisling list");
					break;
				case 4:
					System.out.println("moscato list");
					break;					
			}//end type switch
		}//end view switch	
	do{
		System.out.println();//blank line for visual
		System.out.println("Enter wine name:  ");
		k.nextLine();
		String name = k.nextLine();
		
		System.out.println("Enter quantity:  ");
		int quantity = k.nextInt();
		
		
		System.out.println("Another line item? (y/n)");
		k.nextLine();
		choice = k.nextLine();
	}while(choice.equalsIgnoreCase("y"));
	
	System.out.println("Description\t\t\tPrice\t\tQty\t\tTotal");
	
	System.out.println();
	System.out.format("Invoice total:  $" + total );
	}//psmv


}// end class
