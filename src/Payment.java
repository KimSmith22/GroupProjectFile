import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Payment {

	private double salesTax = .0600;
	private double grandTotal;
	private double price;
	
	
	double finalFinalTotal = 0;
	Scanner scan = new Scanner(System.in);

	public void getCash(double subTotal, Scanner scan) {
		setSubTotal(price);
		double getGrandTotal = subTotal + salesTax;
		boolean rightAmount = true;
		do {
			System.out.println("Enter cash value");
			double cash = scan.nextDouble();
			setCashPaid(cash);
			if (getCashPaid() < getGrandTotal) {
				System.out.println(
						"This does not equal the total. Please check the total and input the" + "right amount.");
				rightAmount = false;
			} else {
				setChange(cash - getGrandTotal);
				System.out.println("Here is your change" + RoundTo2Decimals(getChange()));
				rightAmount = true;
			}
		} while (rightAmount == false);

	}


	public void getCheck(double subTotal, Scanner scan) {
		getSubTotal(grandTotal);
		boolean rightAmount = true;
		do {
			System.out.println("Enter check number");
			double checkAmount = scan.nextDouble();
			setCheck(checkAmount);
			if (getCheck() < getGrandTotal()) {
				System.out.println(
						"This does not equal the total. Please check the total and input the" + "right amount.");
				rightAmount = false;
			} else {
				System.out.println("Thank you for your purchase ");
				rightAmount = true;
			}
		} while (rightAmount == false);
	}

	public double getCardNumber(Scanner sc, String prompt) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		boolean validCC = false;
		while (validCC == false) {
			System.out.println(prompt);
			String ccNumber = sc.next();
			if (ccNumber.length() < 15 || ccNumber.length() > 16) {
				System.out.println("Insufficient digits. Please make sure you enter the entire number");
				continue;
			} else {
				System.out.println("The card number you entered is " + ccNumber);
				validCC = true;
			}
			System.out.println("Please enter date of expiration (mm/yyyy) ");
			
			boolean validDate = false;
			while (validDate == false) {
				try {
					String expirationDate = sc.next();
					Date date = dateFormat.parse(expirationDate);
					validDate=true;
				} catch (ParseException bad) {
					System.out.println("Please enter in the format as shown");
					validDate=false;
				}
			}
			System.out.println("Please enter the CVV number on the back of your card");
			String CVVnumber = sc.nextLine();
			Validator.isValidIntCVV(sc, CVVnumber, 3);
		}
		return cardNumber;
	}

	public double RoundTo2Decimals(double val) {
		DecimalFormat df2 = new DecimalFormat("###.##");
		return Double.valueOf(df2.format(val));
	}
}`