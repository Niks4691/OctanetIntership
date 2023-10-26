package ATM_Interface;
import java.util.*;
public class Mainclass
{
	public static void main(String args[])
	{
		AtmOperationInterface op   = new AtmOperationImpl();
		
		int atmnumber=12345;
		int atmpin=123;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Atm Machine !!!");
		System.out.print("Entre Atm Number : ");
		int atmNumber=sc.nextInt();
		
		System.out.print("Enter pin : ");
		int pin=sc.nextInt();
		
		if((atmnumber==atmNumber)&&(atmpin==pin))
		{
			while(true)
			{
				System.out.println("1.view Available Balance \n 2.Withdraw Amount\n 3.Deposite Amount \n4.View MiniStatement\n5.Exit");
				System.out.println("Entre Choice :");
				int ch=sc.nextInt();
				if(ch==1)
				{
					op.viewBalance();
				}
				else if(ch==2)
				{
					System.out.println("Entre amount to withdraw");
					double withdrawAmount=sc.nextDouble();
					op.WithdrawAmount(withdrawAmount);
				}
				
				else if (ch==3)
				{
					System.out.println("Entre amount to Deposit :");
					double depositeAmount=sc.nextDouble();//5000
					op.depositAmount(depositeAmount);
				}
				else if(ch==4)
				{
					op.viewMiniStatement();
				}
				else if(ch==5)
				{
					System.out.println("Collect your Atm Card\n Thank You For Using Atm Machine !!");
					System.exit(0);
				}
				else
				{
					System.out.println("plz entre the correct choice");
				}
			}
			
		}else {
			System.out.println("Incorrect Atm Number or Pin");
			System.exit(0);
			
		}
		
		
	}

}
