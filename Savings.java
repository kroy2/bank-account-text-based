package kanishka_roy;

import java.io.*;
import java.util.*;

public class Savings {
	public double Savemon, inter;

	// Applied interest to the savings account balance
	public double in() {
		Savemon = Savemon + inter;
		return inter = Savemon * 0.05;
	}
	//adding money to savings account
	public double deposit(double pp) {
		Savemon = Savemon + pp;
		return Savemon;
	}
	//withdrawing money from savings account
	public double with(double qq) {
		Savemon = Savemon - qq;
		return Savemon;
	}
}
