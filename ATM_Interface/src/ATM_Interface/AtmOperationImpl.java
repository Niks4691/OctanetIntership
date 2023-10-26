package ATM_Interface;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl  implements AtmOperationInterface
{
       ATM atm = new ATM();
       
       Map<Double,String>ministmt= new HashMap<>();
	@Override
	public void viewBalance()
	{
		System.out.println("Available balance is :"+atm.getBalance());
		
	}

	@Override
	public void WithdrawAmount(double withdrawAmount) 
	{
		if(withdrawAmount%500==0)
		{
			if(withdrawAmount <= atm.getBalance())
			{
				ministmt.put(withdrawAmount, "amount withdrawn");
				System.out.println("Collect the cash"+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			else {
				System.out.println("Insufficient balance !!");
			}
		}
		else
		{
			System.out.println("please entre the amount in mutipal of 500");
		}
	}

	@Override
	public void depositAmount(double depositeAmount) 
	{
		ministmt.put(depositeAmount,"Amount Deposite");
		System.out.println(depositeAmount+"Deposited Successfully !!");
		atm.setBalance(atm.getBalance()+depositeAmount);
		viewBalance();
		
	}

	@Override
	public void viewMiniStatement() 
	{
	   for(Map.Entry<Double,String> m:ministmt.entrySet())
	   {
		  System.out.println(m.getKey()+" "+m.getValue());
	   }
		
	}

}
