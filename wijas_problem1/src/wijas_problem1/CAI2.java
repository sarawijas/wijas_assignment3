package wijas_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {

	public static void main(String[] args) {
		quiz();

	}

	private static void quiz() {
		SecureRandom secureRandom = new SecureRandom();
		int randomInt1 = secureRandom.nextInt(10);
		int randomInt2 = secureRandom.nextInt(10);
		askQuestion(randomInt1, randomInt2);

		while(readResponse() != isAnswerCorrect(randomInt1, randomInt2)) {
			displayIncorrectResponse();
			askQuestion(randomInt1, randomInt2);
		}
		
		displayCorrectAnswer();
		
	}

	private static void askQuestion(int a, int b) {
		System.out.println("What is " + a + " * " + b);
	}

	private static int readResponse() {
		Scanner scanner = new Scanner(System.in);
		int answer = scanner.nextInt();
		return answer;
	}

	private static int isAnswerCorrect(int a, int b) {
		int rightanswer = a * b;
		return rightanswer;
	}
	
	private static void displayCorrectAnswer() {
		SecureRandom secureRandom = new SecureRandom();
		int randomInt3 = secureRandom.nextInt(5);
		
		switch(randomInt3) {
			case 1:
				System.out.println("Very good!");
				break;
				
			case 2:
				System.out.println("Excellent!");
				break;
				
			case 3:
				System.out.println("Nice Work!");
				break;
				
			case 4:
				System.out.println("Keep up the good work!");
				break;
				
		}
			
	}
	
	private static void displayIncorrectResponse() {
		SecureRandom secureRandom = new SecureRandom();
		int randomInt4 = secureRandom.nextInt(5);
		
		switch(randomInt4) {
			case 1:
				System.out.println("No. Please try again.");
				break;
				
			case 2:
				System.out.println("Wrong. Try once more.");
				break;
				
			case 3:
				System.out.println("Don't give up!");
				break;
				
			case 4:
				System.out.println("No. Keep trying.");
				break;
		
		}
		
	}

}
