package kanishka_roy;
import java.io.*;
import java.util.*;

public class Checking {
	public double CheckingMoney;

	public void currentFundsChecking() {
		System.out.println("You have " + "$" + CheckingMoney + " dollars in your checking account");
	}
	
	// deposit money method to be called into database function in Acc class
	public double deposit(double moneyIn) {
		CheckingMoney = CheckingMoney + moneyIn;
		return CheckingMoney;
	}
	// withdraw money method to be called into database function in Acc class
	public double with(double moneyOut) {
		CheckingMoney = CheckingMoney - moneyOut;
		return CheckingMoney;
	}
}
