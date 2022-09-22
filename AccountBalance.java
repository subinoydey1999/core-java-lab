/*
Program: Creating a min bal<1000 
@author: subinoy dey
@date: 22.09.22
*/
// declaring class
class AccountBalance
{
	private int accountNumber;
	private String bankname;
	private double balance;
	
{
	AccountBalance()
    {
		accountNumber=0;
		name="State bank of india";
		balance=00.00;
	}
	AccountBalance(int accountNumber, String bankname)
	{
		this.accountNumber=accountNumber;
		this.bankname=name;
		this.balance= 1000.00;
	}
	
	{
	   double money =this.balance;
       money= money-amt;
       if(money>=1000.00)
    {
	   this.balance=money;
       System.out.println("The balance for :"+this.accountNumber+ "has been debited by :Rs"+ amt);
	   System.out.println("Total balance is :Rs"+this.balance);
	}
	void printBankAccountDetails()
	{
		System.out.println("Account Number :"+this.accountNumber);
		System.out.println("Account  bankName :"+this.name);
	    System.out.println("Account Balance :"+this.balance);
		
	}
	 
	 class Account
{
	
	public static void main(String ...args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		double bal;