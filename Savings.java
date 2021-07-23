
import java.io.*;
import java.util.*;

public class Savings {
	public double Savemon, inter;

	// Applied interest to the savings account balance, to be called in for Savings
	// in Acc class
	public double in() {
		Savemon = Savemon + inter;
		return inter = Savemon * 0.05;
	}

	// adding money to savings account, to be called in for Savings in Acc class
	public double deposit(double moneyIn) {
		Savemon = Savemon + moneyIn;
		return Savemon;
	}

	// withdrawing money from savings account, to be called in for Savings in Acc
	// class
	public double with(double moneyOut) {
		Savemon = Savemon - moneyOut;
		return Savemon;
	}

	public void InterestTracker() {
		Scanner days = new Scanner(System.in);
		System.out.println(
				"How many days in advance you like to calculate the interest rate? Please enter a positive integer.");
		String daysInAdvance_s = days.next(); // Takes user response as string
		int daysInAdvance = Integer.parseInt(daysInAdvance_s); // converts user response into integer
		int x = 1;
		double projectedMoney = Savemon; // encapsulation: so Savemon is not affected
		while (x < daysInAdvance) {
			projectedMoney = projectedMoney * 1.05;
			x++;
			// Takes amount of money currently in savings and increases amount by 5% 
		}
		System.out.println("$" + projectedMoney + " at day " + daysInAdvance);

	}

}
