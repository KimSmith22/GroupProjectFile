public class ProductManager implements java.io.Serializable {
	
	public String name;
	public String paymentMethod;
	public String description;
	public int quantity;
	private static double tax;
	public static double price;

	public ProductManager(){}
	public ProductManager(String name, String description, int quantity, double price) {
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name; 
	}

	public void setDescription(String description) {
		this.description = description; 
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity; 
	}

	public void setPrice(double price) {
		this.price = price; 
	}

	public String getName() {
		return (this.name); 
	}

	public String getDescription() {
		return (this.description); 
	}

	public int getQuantity() {
		return (this.quantity); 
	}

	public static double getPrice() {
		return price; 
	}
	public static String getFormatPrice(){
		String formatPrice = String.format("%10.0f%n", getPrice());
		return formatPrice;
	}
	public static double getTax(){
		double tax = price * .06;
		return tax;
	}
	public static String getFormattedTax(){
		String formatTax = String.format("%10.0f%n", getTax());
		return formatTax;
	}
	public static double getGrandTotal(){
		double grandTotal = (price + tax);
		return grandTotal;
	}
	public static String getFormattedGrandTotal() {
		String formatGrandTotal = String.format("%10.0f%n", getGrandTotal());
		return formatGrandTotal;
	}
	public String toString() {
		String sep = System.getProperty("line.separator");
		StringBuffer buffer = new StringBuffer();
		buffer.append(sep);
		buffer.append("----- Product Detail ----- ");
		buffer.append(sep);
    buffer.append("\tWine = ");
		buffer.append(name);
		buffer.append(sep);
		buffer.append("\tDescription = ");
		buffer.append(description);
		buffer.append(sep);
		buffer.append("\tQuantity = ");
		buffer.append(quantity);
		buffer.append(sep);
		buffer.append("\tPrice = ");
		buffer.append(price);
		buffer.append(sep);
		buffer.append("\tPaymentMethod = ");
		buffer.append(paymentMethod);
		
		return buffer.toString();
	}//toString

	}

	


//class