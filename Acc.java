// @Author primary - Kanishka
// @Author secondary - Ali

import java.io.*;
import java.util.*;

public class Acc {
	Scanner a = new Scanner(System.in);
	String chequingChoice, savingsChoice; //string variables to be used for chequing and Savings respectively 
	Savings savings = new Savings();
	Chequing chequing = new Chequing();
	String choices;
	// variable for array list set in order to be called later for tracking
	ArrayList<Double> chequingAmount = new ArrayList<Double>();
	ArrayList<Double> savingsAmount = new ArrayList<Double>();

	/**
	 * Function for chequing and Savings account set in Acc class.
	 * This method uses and initial Try exceptions for an overlay of choices in terms of database of accounts.
	 * The while loop presents the user with the options to choose from, included in the database of accounts.
	 * Another Try exception followed by if/else statements are set in order to support the various user interactions relating to chequing account.
	 * Catch exception used for occurance if user does not enter a number for withdraw/deposit.
	 * 
	 * Since there will be interest on Savings account, there is a print statement underlying the fact that there is 5% interest for Savings.
	 */
	public String database() {
		while (true) {
	// boolean set as true to be returned false
			boolean b = true;
			System.out.println(
					"In order to choose an account, type either \"Savings\", \"Chequing\", or \"Exit\" to stop the program.");
	// try exception for invoking choices
			try {
				choices = a.next();
				if (choices.equalsIgnoreCase("chequing")) {
	// Providing user with database of accounts to choose from
					while (b) {
						System.out.println(
								"In order to interact, type in either \"Withdraw\", \"Deposit\", \"Track\", or \"Exit\".");
	// try exception for user to pick various options to choose from
						try {
							// initial string variable called in for chequing
							chequingChoice = a.next();
							if (chequingChoice.equalsIgnoreCase("Withdraw")) { 
								System.out.println("What is the amount you want to withdraw?");
								chequing.with(a.nextDouble());
								System.out.println("In your chequing account, there is $" + chequing.ChequingMoney + "\n");
								b = false;
							} else if (chequingChoice.equalsIgnoreCase("Deposit")) {
								System.out.println("What is the amount you want to deposit?");
								chequing.deposit(a.nextDouble());
								System.out.println("In your chequing account, there is $" + chequing.ChequingMoney + "\n");
								b = false;
	// tracking money based on user interaction with the program
							} else if (chequingChoice.equalsIgnoreCase("Track")) {
								for (int c = 0; c < chequingAmount.size(); c++) {
									System.out.println("Date " + (c + 1) + " $" + chequingAmount.get(c));
								}
							}
	// If user does not type in number for withdraw/deposit, they are presented with message written in if statement in catch exception
						} catch (InputMismatchException notNumber) {
							System.out.println("Please type in a number. \n");
							continue;
						}
					}
	// Other option for database of accounts; Savings account
				} else if (choices.equalsIgnoreCase("Savings")) {
	// Interest rate for savings account
					System.out.println("There will be a 5% interest gain per day on your amount in the account. \n");
					while (b) {
	// Similar overlay of database to that of chequing account
						System.out.println("Type in either \"Withdraw\", \"Deposit\", \"Track\", \"Interest projection\", or \"Exit\".");

						try {
							// initial string variable called in for Savings
							savingsChoice = a.next();
	// if/else statements similar to that of chequing, but now including the fact there is interest.
							if (savingsChoice.equalsIgnoreCase("Deposit")) {
								System.out.println("What is the amount you want to deposit?");
								savings.deposit(a.nextDouble());
								System.out.println("In your Savings account, there is $" + savings.SavingsMoney + "\n");
								b = false;
							} else if (savingsChoice.equalsIgnoreCase("Withdraw")) {
								System.out.println("What is the amount you want to withdraw?");
								savings.with(a.nextDouble());
								System.out.println("In your Savings account, there is $" + savings.SavingsMoney + " including 5% interest" + "\n");
								b = false;
	// Tracking similar to that of chequing, but accounting for the fact that there is a 5% interest applied to the account everyday. 
							} else if (savingsChoice.equalsIgnoreCase("Track")) {
								for (int x = 0; x < savingsAmount.size(); x++) {
									System.out.println("Date " + (x + 1) + " $" + savingsAmount.get(x));
									b = false;
								}
							}
							else if (savingsChoice.equalsIgnoreCase("Interest projection")) {
								savings.InterestTracker();
							}
	// similar to chequing, if anything other than a number is typed into the program in this case, this message will be displayed.
						} catch (InputMismatchException notNumber) {
							System.out.println("Please type in a number. \n");
							continue;
						}
					}
   // Exiting the program
				} else if (choices.equalsIgnoreCase("Exit")) {
					System.exit(0);
				}
// catch exception for savings and chequing if the program catches a input other than a number in a given circumstance
				savingsAmount.add(savings.SavingsMoney);
				savings.in();
				chequingAmount.add(chequing.ChequingMoney);
			} catch (InputMismatchException notNumber) {
// message for error handling, based on input being anything other than a number in a given circumstance
				System.out.println("This program only requires numbers typed in. \n");
				continue;
			}
		}
	}
}
