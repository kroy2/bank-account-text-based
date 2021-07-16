
import java.util.*;
import java.io.*;
public class Tester extends Acc
{
	public static void main(String args[])
	{
		System.out.println("Hello, and thank you for joining this user friendly banking system. This system includes debit offers in terms of checkings and savings.");
		Acc count=
				new Acc();
		while(true)
		{
			count.checking(); //checking/savings account
		}
	}
}
