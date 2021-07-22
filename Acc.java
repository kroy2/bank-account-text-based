package kanishka_roy;
import java.io.*;
import java.util.*;

public class Acc {
	Scanner a = new Scanner(System.in);
	String acho, bcho; //string variables to be used for Checking and Savings respectively 
	Savings saving = new Savings();
	Checking checking = new Checking();
	String choices;
	ArrayList<Double> aaa = new ArrayList<Double>();
	ArrayList<Double> bbb = new ArrayList<Double>();

	/**
	 * Function for Checking and Savings account set in Acc class.
	 * This method uses and initial Try exceptions for an overlay of choices in terms of database of accounts.
	 * The while loop presents the user with the options to choose from, included in the database of accounts.
	 * Another Try exception followed by if/else statements are set in order to support the various user interactions relating to Checking account.
	 * Catch exception used for occurance if user does not enter a number for withdraw/deposit.
	 * 
	 * Since there will be interest on Savings account, there is a print statement underlying the fact that there is 5% interest for Savings.
	 */
	public String database() {
		while (true) {
			boolean b = true;
			System.out.println(
					"In order to choose an account, type either \"Savings\", \"Checking\", or \"Exit\" to stop the program.");
	// try exception for invoking choices
			try {
				choices = a.next();
				if (choices.equalsIgnoreCase("Checking")) {
	// Providing user with database of accounts to choose from
					while (b) {
						System.out.println(
								"In order to interact, type in either \"Withdraw\", \"Deposit\", \"Track\", or \"Exit\".");
	// try exception for user to pick various options to choose from
						try {
							// initial string variable called in for Checking
							acho = a.next();
							if (acho.equalsIgnoreCase("Withdraw")) { 
								System.out.println("What is the amount you want to withdraw?");
								checking.with(a.nextDouble());
								System.out.println("In your Checking account, there is $" + checking.Checkmon + "\n");
								b = false;
							} else if (acho.equalsIgnoreCase("Deposit")) {
								System.out.println("What is the amount you want to deposit?");
								checking.deposit(a.nextDouble());
								System.out.println("In your Checking account, there is $" + checking.Checkmon + "\n");
								b = false;
	// tracking money based on user interaction with the program
							} else if (acho.equalsIgnoreCase("Track")) {
								for (int c = 0; c < aaa.size(); c++) {
									System.out.println("Date " + (c + 1) + " $" + aaa.get(c));
								}
							}
	// If user does not type in number for withdraw/deposit, they are presented with message written in if statement in catch exception
						} catch (InputMismatchException d) {
							System.out.println("Please type in a number. \n");
							continue;
						}
					}
	// Other option for database of accounts; Savings account
				} else if (choices.equalsIgnoreCase("Savings")) {
	// Interest rate for savings account
					System.out.println("There will be a 5% interest gain per day on your amount in the account. \n");
					while (b) {
	// Similar overlay of database to that of Checking account
						System.out.println("Type in either \"Withdraw\", \"Deposit\", \"Track\", or \"Exit\".");

						try {
							// initial string variable called in for Savings
							bcho = a.next();
	// if/else statements similar to that of Checking, but now including the fact there is interest.
							if (bcho.equalsIgnoreCase("Deposit")) {
								System.out.println("What is the amount you want to deposit?");
								saving.deposit(a.nextDouble());
								System.out.println("In your Savings account, there is $" + saving.Savemon + "\n");
								b = false;
							} else if (bcho.equalsIgnoreCase("Withdraw")) {
								System.out.println("What is the amount you want to withdraw?");
								saving.with(a.nextDouble());
								System.out.println("In your Savings account, there is $" + saving.Savemon + " including 5% interest" + "\n");
								b = false;
	// Tracking similar to that of Checking, but accounting for the fact that there is a 5% interest applied to the account everyday. 
							} else if (bcho.equalsIgnoreCase("Track")) {
								for (int x = 0; x < bbb.size(); x++) {
									System.out.println("Date " + (x + 1) + " $" + bbb.get(x));
									saving.InterestTracker();
									b = false;
								}
							}
	// similar to Checking, if anything other than a number is typed into the program in this case, this message will be displayed.
						} catch (InputMismatchException d) {
							System.out.println("Please type in a number. \n");
							continue;
						}
					}
   // Exiting the program
				} else if (choices.equalsIgnoreCase("Exit")) {
					System.exit(0);
				}
				bbb.add(saving.Savemon);
				saving.in();
				aaa.add(checking.Checkmon);
			} catch (InputMismatchException d) {
				System.out.println("This program only requires numbers typed in. \n");
				continue;
			}
		}
	}
}
