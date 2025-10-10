package oops;

class ATM{
	private double balance;
	public double getBalance() {
		return balance;
	}
	
	public ATM (double IntialBalance) {
		balance=IntialBalance;
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			processwithdrawal(amount);
			
			
		}
		else {
			System.out.println("the invalid withdrawal");
		}
	}
	private void processwithdrawal(double amount)//it is fully encapsulated
	{
		balance -=amount;
		System.out.println("Rs." +amount+ " is withdrawn Successfully");
	}
	
}
public class Encapsulesecond {
	public static void main(String[] args) {
		ATM a=new ATM(10000);
		a.withdraw(500.5);
		System.out.println("the remaining amount "+a.getBalance());
		
	}

}
