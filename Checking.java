import java.io.*;
import java.util.*;

public class Checking {
	public double Checkmon;

	// deposit money method to be called into database function in Acc class
	public double deposit(double moneyIn) {
		Checkmon = Checkmon + moneyIn;
		return Checkmon;
	}
	// withdraw money method to be called into database function in Acc class
	public double with(double moneyOut) {
		Checkmon = Checkmon - moneyOut;
		return Checkmon;
	}
}
