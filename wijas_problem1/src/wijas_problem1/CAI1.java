package wijas_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {

	public static void main(String[] args) {
		quiz();

	}

	private static void quiz() {
		//ask the student to solve a multiplication problem
		//System.out.println("Very good!"); if right
		//System.out.println("No. Please try again"); if wrong
		//program exits when they input the right answer
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
		System.out.println("Very good!");
	}
	
	private static void displayIncorrectResponse() {
		System.out.println("No. Please Try Again.");
	}
	
}

