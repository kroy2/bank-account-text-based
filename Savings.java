
import java.io.*;
import java.util.*;

public class Savings {
	public double Savemon, inter;

	public double in() {
		Savemon = Savemon + inter;
		return inter = Savemon * 0.05;
	}

	public double deposit(double pp) {
		Savemon = Savemon + pp;
		return Savemon;
	}

	public double with(double qq) {
		Savemon = Savemon - qq;
		return Savemon;
	}
}
