import java.io.*;
import java.util.*;

public class Savings {
	public double Savemon, inter;

	// Applied interest to the savings account balance, to be called in for Savings in Acc class
	public double in() {
		Savemon = Savemon + inter;
		return inter = Savemon * 0.05;
	}
	//adding money to savings account, to be called in for Savings in Acc class
	public double deposit(double pp) {
		Savemon = Savemon + pp;
		return Savemon;
	}
	//withdrawing money from savings account, to be called in for Savings in Acc class
	public double with(double qq) {
		Savemon = Savemon - qq;
		return Savemon;
	}
	public double InterestTracker() {
		Scanner days = new Scanner(System.in);
		System.out.println("How many days in advance you like to calculate the interest rate? Please enter a positive integer.");
		String daysInAdvance_s = days.next();
		int daysInAdvance = Integer.parseInt(daysInAdvance_s);
		int x = 0;
		while (x < daysInAdvance) {
			in();
			x++;
		}
		return inter;
		
	}
	

}
