
import java.util.*;
import java.io.*;

// program run from tester class
// tester class includes initial introductory message upon using the program every time after running
public class Tester extends Acc {
	public static void main(String args[]) {
		System.out.println(
				"Hello, and thank you for joining this user friendly banking system. This system includes debit offers in terms of checkings and savings.");
		Acc count = new Acc();
		while (true) {
			// calling for database function set in Acc class
			count.database(); // checking/savings account
		}
	}
}
