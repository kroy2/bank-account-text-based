import java.io.*;
import java.util.*;

public class Checking {
	public double Checkmon;

	// deposit money method to be called into database function in Acc class
	public double deposit(double p) {
		Checkmon = Checkmon + p;
		return Checkmon;
	}
	// withdraw money method to be called into database function in Acc class
	public double with(double q) {
		Checkmon = Checkmon - q;
		return Checkmon;
	}
}
