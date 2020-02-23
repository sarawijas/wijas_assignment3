package wijas_problem2;

public class SavingsAccount {

	public void calculateMonthlyInterest(double annualInterestRate, double savingsBalance) {
		savingsBalance = (savingsBalance * annualInterestRate)/12;
		System.out.println("The monthly interest is " + savingsBalance);
	}
	
	public static void main(String[] args) {
		double annualInterestRate;
	}

	public static double modifyInterestRate(double a) {
		double annualInterestRate = a;
		return annualInterestRate;
	}

	
	

}
