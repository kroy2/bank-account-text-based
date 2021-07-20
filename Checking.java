package kanishka_roy;
import java.io.*;
import java.util.*;

public class Checking {
	public double Checkmon;

	// deposit money into checking account
	public double deposit(double p) {
		Checkmon = Checkmon + p;
		return Checkmon;
	}
	// withdraw money from checking account
	public double with(double q) {
		Checkmon = Checkmon - q;
		return Checkmon;
	}
}

