// @Author primary - Ali
// @Author secondary - Kanishka

import java.io.*;
import java.util.*;

public class Chequing {
	public double ChequingMoney;

	public void currentFundsChequing() {
		System.out.println("You have " + "$" + ChequingMoney + " dollars in your checking account");
	}
	
	// deposit money method to be called into database function in Acc class
	public double deposit(double moneyIn) {
		ChequingMoney = ChequingMoney + moneyIn;
		return ChequingMoney;
	}
	// withdraw money method to be called into database function in Acc class
	public double with(double moneyOut) {
		ChequingMoney = ChequingMoney - moneyOut;
		return ChequingMoney;
	}
}
