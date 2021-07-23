import java.io.*;
import java.util.*;
public class Acc 
{
	Scanner a=
			new Scanner(System.in);
	String acho, bcho;
	Savings savin=
			new Savings();
	Checking checking=
			new Checking();
	String choices;
	ArrayList<Double>aaa=
			new ArrayList<Double>();
	ArrayList<Double>bbb=
			new ArrayList<Double>();
	
	public String checking()
	{
		while(true)
		{
			boolean b
			=true;
			System.out.println("In order to choose an account, type either \"Savings\", \"Checking\", or \"Exit\" to stop the program.");
			try
			{
				choices=
						a.next();
				if(choices.equalsIgnoreCase("Checking"))
				{
					while(b)
					{
						System.out.println("In order to interact, type in either \"Withdraw\", \"Deposit\", \"Track\", or \"Exit\".");
						try
						{
							acho=
								a.next();
							if(acho.equalsIgnoreCase("Withdraw"))
							{
								System.out.println("What is the amount you want to withdraw?");
								checking.with(a.nextDouble());
								System.out.println("In your Checking account, there is $"+ checking.Checkmon + "\n");
								b=
										false;
							}
							else if(acho.equalsIgnoreCase("Deposit"))
							{
								System.out.println("What is the amount you want to deposit?");
								checking.deposit(a.nextDouble());
								System.out.println("In your Checking account, there is $"+ checking.Checkmon + "\n");
								b=
										false;
							}
							else if(acho.equalsIgnoreCase("Track"))
							{
								for(int c=0; c<aaa.size(); c++)
								{
									System.out.println("Date "+ (c+1) +" $"+aaa.get(c));
								}
							}
						}
						catch(InputMismatchException d)
						{
							System.out.println("This program only requires numbers typed in. \n");
							continue;
						}
					}
				}
				else if(choices.equalsIgnoreCase("Savings"))
				{
					System.out.println("There will be a 5% interest gain per day on your amount in the account. \n");
					while(b)
					{
						System.out.println("Type in either \"Withdraw\", \"Deposit\", \"Track\", or \"Exit\".");
						
						try
						{
							bcho=
									a.next();
							
							if(bcho.equalsIgnoreCase("Deposit"))
							{
								System.out.println("What is the amount you want to deposit?");
								savin.deposit(a.nextDouble());
								System.out.println("In your Savings account, there is $"+ savin.Savemon + "\n");
								b=
										false;
							}
							else if(bcho.equalsIgnoreCase("Withdraw"))
							{
								System.out.println("What is the amount you want to withdraw?");
								savin.with(a.nextDouble());
								System.out.println("In your Savings account, there is $"+ savin.Savemon + "\n");
								b=
										false;
							}
							else if(bcho.equalsIgnoreCase("Track"))
							{
								for(int x=0; x<bbb.size(); x++)
								{
									System.out.println("Date "+ (x+1) +" $"+bbb.get(x));
								b=
										false;
								}
							}
						}
						catch(InputMismatchException d)
						{
							System.out.println("This program only requires numbers typed in. \n");
							continue;
						}
					}
				}
				else if(choices.equalsIgnoreCase("Exit"))
				{
					System.exit(0);
				}
				bbb.add(savin.Savemon);
				savin.in();
				aaa.add(checking.Checkmon);
			}
			catch(InputMismatchException d)
			{
				System.out.println("This program only requires numbers typed in. \n");
				continue;
			}
		}
	}
}
