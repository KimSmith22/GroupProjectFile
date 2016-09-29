import java.util.ArrayList;



public class Wine {
	
	ArrayList<Wine> winelist = new ArrayList<Wine>();
	
	Winelist.add(new Wine("Villa Alena", "Moscato", 6.99));
	Winelist.add(new Wine("Beviano", "Mascato", 9.99));
	Winelist.add(new Wine("Flip Flop",  "Mascato", 10.00));
	Winelist.add(new Wine("Columbia Valley", "Merlot", 12.00));
	Winelist.add(new Wine("North Coast", "Merlot", 9.99));
	Winelist.add(new Wine("Mark West", "Pinot Noir", 11.00));
	Winelist.add(new Wine("DeLoach", "Pinot Noir", 18.99));
	Winelist.add(new Wine("Castle Rock", "Pinot Noir", 8.99));
	Winelist.add(new Wine("Murphy’s Law", "Riesling", 12.99));
	Winelist.add(new Wine("Washington Hills", "Riesling", 10.00));
	Winelist.add(new Wine("Standing Stone", "Riesling", 11.99));
	Winelist.add(new Wine("Bex", "Riesling", 10.99));

	//If we want to display the arraylist
	public void display (ArrayList <Wine>displayit){
	for (int i=0; i<=displayit.size();i++){
	System.out.println (displayit.get(i));


	
	}

	}

public static void add(Wine winelist) {
	// TODO Auto-generated method stub
	
}


}
