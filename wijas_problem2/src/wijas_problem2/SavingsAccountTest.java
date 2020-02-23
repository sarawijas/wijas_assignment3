package wijas_problem2;

public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		double savings1 = 2000.00;
		double savings2 = 3000.00;
		
		double annualInterestRate = saver1.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest(annualInterestRate, savings1);
		saver2.calculateMonthlyInterest(annualInterestRate, savings2);
		
		annualInterestRate = saver1.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest(annualInterestRate, savings1);
		saver2.calculateMonthlyInterest(annualInterestRate, savings2);
		
	}

}
