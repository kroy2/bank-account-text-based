
import java.io.*;
import java.util.*;

public class Checking {
	public double Checkmon;

	public double deposit(double p) {
		Checkmon = Checkmon + p;
		return Checkmon;
	}

	public double with(double q) {
		Checkmon = Checkmon - q;
		return Checkmon;
	}
}
