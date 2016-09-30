import java.util.ArrayList;

public class Wine {
private String name;
private String type ;
private double price;
 
public Wine (){
	
}
	public Wine(String name, String type, double price) {// constructor. passing local variables
		this.name = name;//setting the variables using (this)
		this.type = type;
		this.price = price;
	}
	// creating getters and setters
	
	
	public String getName(){
		return  this.name;
	}
	
	public String getName(String newName){
		return (this.name = newName);
	}
	
	
		public String getType(){
		return this.type;
		}
	
		public String getType(String newType){
			return (this.type = newType);
		}
		public double getPrice(){
		return this.price;
		}
		
		public double setPrice(double newPrice){
			return (this.price = newPrice);
		}
	
		public String toString(){
        return  name  + type + price;
    }
	 
	
	}
	

	
	
	
	
