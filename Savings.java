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
}
