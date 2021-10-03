import java.util.ArrayList;
import java.util.Scanner;

/**
 * Not implemented yet in Iteration 1 but are planning to by giving the user the
 * option to create a bill which has a price and frequency Program will auto
 * remove money from chosen account If deduction will cause account to go to 0
 * or below, will display error
 */
public class Bill {
	ArrayList<Bill> BillsList = new ArrayList<Bill>();
	String Billname = "";
	double pricePerfrequency = 0;
	int frequency = 0;

	// Creates a Bill which has 3 elements
	// Name, price every set time period and the time period
	public Bill(String Billname, double pricePerfrequency, int frequency) {
	}

	public void setBillname() {
		Scanner NameOfBill = new Scanner(System.in);
		System.out.println("What is the name of the Bill.");
		Billname = NameOfBill.next();
	}

	public String getBillname() {
		return Billname;
	}

	public void setBillprice() {
		Scanner BillPrice = new Scanner(System.in);
		System.out.println("What is the price of the bill every instance?");
		pricePerfrequency = Double.parseDouble(BillPrice.next()); // Converting response to a double
	}

	public double getBillprice() {
		return pricePerfrequency;
	}

	public void setBillfrequency() {
		Scanner Billfrequency = new Scanner(System.in);
		System.out.println("How often is this bill charged? Respond in days (integers only).");
		frequency = Integer.parseInt(Billfrequency.next()); // Converting string response to integer

	}

	public int getBillfrequency() {
		return frequency;
	}

}
