package javaPackage;

public class BankDataAbstraction extends DepositAmount {

		void deposit()
		{
			int lastbalance=500;
			int lastdeposit=100;
			int currentdeposit=lastdeposit+lastbalance;
			System.out.println("My current balance is $"+currentdeposit);
		}
		void display_message()
		{
			System.out.println("Thank you for depositing money in my bank");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankDataAbstraction obj=new BankDataAbstraction();
obj.deposit();
obj.display_message();
	}

}

abstract class DepositAmount
{
	abstract void deposit();
	void lastBalance()
	{
		int a=500;
		System.out.println("My last balance is $"+a);
	}
	void display_message()
	{
		System.out.println("Thank you for using My bank");
	}
}



