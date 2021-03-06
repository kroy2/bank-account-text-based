
import java.util.Scanner;

public class TFSA {

	// initial variables assigned for choices in TFSA function and RiskManagement
	// function
	String yes_or_no;
	String riskChoices;
	Scanner a = new Scanner(System.in);
	String fundingChoice;

	/**
	 * function for TFSA presents user with the option to set up a TFSA or not.
	 * based on user input to prompt, system will prompt user to choose a funding
	 * option for their account.
	 */
	public TFSA() {
		// {
		// while(true) {
		// }
		// boolean b = true;
		// user prompted with the option of setting up TFSA
		System.out.println("Would you like to set up a TFSA? Yes or No?");
		// using try exceptions to fulfill conditions met/not met
		try {
			yes_or_no = a.next();
			if (yes_or_no.equalsIgnoreCase("Yes")) {
				// while(b)
				{
					// user prompted to choose funding option
					System.out.println(
							"How much money would you like to fund your account to begin with? 1000, 2000, or 3000?");
					try {
						fundingChoice = a.next();
					// option to fund 1000
						if (fundingChoice.equals("1000")) {
							 System.out.println("Selected: $1000.00 to fund account");
							// b=false;
						}
					// option to fund 2000
						else if(fundingChoice.equals("2000")) {
							System.out.println("Selected: $2000.00 to fund account");
						}
					// option to fund 3000
						else if(fundingChoice.equals("3000")) {
							System.out.println("Selected: $3000.00 to fund account");
						}
					} finally { // temporary. May remove later.

					}
				}
			}
		} finally { // temporary. May remove later.

		}
	}

	//function for risk management prompts user to choose between low risk and high risk portfolio.
	public void RiskManagement() {
		System.out
				.println("Please indicate your desired portfolio: Low risk or High risk, or Exit to stop the program.");
		{
			riskChoices = a.next();
			if (riskChoices.equalsIgnoreCase("Low risk")) {
				System.out.println("Selected: Low risk portfolio");
			} else if (riskChoices.equals("High risk"))
				;
			{
				System.out.println("Selected: High risk portfolio");
			}
		}

	}
}
