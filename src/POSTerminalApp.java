import java.util.ArrayList;
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
		// variables
		String choice = "y";

		double total = 0.00;
		
		//welcome and prompts

ArrayList<Wine> winelist = new ArrayList<Wine>();
	
	winelist.add(new Wine("Villa Alena", "Moscato", 6.99));
	winelist.add(new Wine("Beviano", "Mascato", 9.99));
	winelist.add(new Wine("Flip Flop",  "Mascato", 10.00));
	winelist.add(new Wine("Columbia Valley", "Merlot", 12.00));
	winelist.add(new Wine("North Coast", "Merlot", 9.99));
	winelist.add(new Wine("Mark West", "Pinot Noir", 11.00));
	winelist.add(new Wine("DeLoach", "Pinot Noir", 18.99));
	winelist.add(new Wine("Castle Rock", "Pinot Noir", 8.99));
	winelist.add(new Wine("Murphy�s Law", "Riesling", 12.99));
	winelist.add(new Wine("Washington Hills", "Riesling", 10.00));
	winelist.add(new Wine("Standing Stone", "Riesling", 11.99));
	winelist.add(new Wine("Bex", "Riesling", 10.99));

		// welcome and prompts

		System.out.println("Welcome to our Wine Shop!");
		Invoice invoice = new Invoice();
		getLineItems(invoice;)
		displayInvoice(invoice);
		System.out.println();

		System.out.println("Press 1 to view entire inventory or 2 to view by category");
		Scanner k = new Scanner(System.in);
		int view = k.nextInt();
		
		switch(view){//view inventory switch

		case 1:
			System.out.println("inventory list");
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
		
		Product product = wine[].getProduct(product code);
		invoice.addItem(new LineItem(product, quantity));
		
		System.out.println("Another line item? (y/n)");
		k.nextLine();
		choice = k.nextLine();
	}while(choice.equalsIgnoreCase("y"));
	
	System.out.println("Description\t\t\tPrice\t\tQty\t\tTotal");
	
	System.out.println();
	System.out.format("Invoice total:  $" + invoice.getFormattedTotal());
	}//psmv


}// end class
