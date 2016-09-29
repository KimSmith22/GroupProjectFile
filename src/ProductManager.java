public class ProductManager {
	private String name; 
	private String type; 
	private double price; 
	private static double tax = 6.00;
	
	//constructor 
	public Product(String name, String type, double price){
		this.name = name;
		this.type = category;
		this.price = price;
	}
	
	public Product(String name, String type, String price){
		this.name = name;
		this.type = category;
		this.price = Double.parseDouble(price);
		}
	
	public Product(){
		this.name = null;
		this.type = null;
		this.price = 0;
	}
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	
	public double getPrice() {
		return price;
	}
	
	public static double getTax() { 
		return tax;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setPrice(String details) {
		this.price = Double.parseDouble(details);
	}
	
	public String toString() {
		return name + "(" + type + ")" + price;
	}
}