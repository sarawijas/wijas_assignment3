package wijas_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI4 {

	public static void main(String[] args) {
		quiz();

	}
	
	private static void quiz() {
		double score = 0.0;
		int difficulty;
	
		difficulty = readDifficulty();
		generateQuestionArgument(difficulty);
		
		for(int i = 0; i < 10; i++) {	
			askQuestion(generateQuestionArgument(difficulty), generateQuestionArgument(difficulty)); //ask a random question
		
				while(readResponse() != isAnswerCorrect(generateQuestionArgument(difficulty) , generateQuestionArgument(difficulty))) { //while the answer is wrong it repeats the same question
					displayIncorrectResponse();
					askQuestion(generateQuestionArgument(difficulty), generateQuestionArgument(difficulty));
					score--;
				}
		
			displayCorrectAnswer(); //when the answer is right it displays a congratulations and adds that score to the total
			score++;
		}
		
		displayCompletionMessage(score);
		
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
			case 1: System.out.println("Very good!");
				break;
				
			case 2: System.out.println("Excellent!");
				break;
				
			case 3:
				System.out.println("Nice Work!");
				break;
				
			case 4: System.out.println("Keep up the good work!");
				break;
				
		}
			
	}
	
	private static void displayIncorrectResponse() {
		SecureRandom secureRandom = new SecureRandom();
		int randomInt4 = secureRandom.nextInt(5);
		
		switch(randomInt4) {
			case 1: System.out.println("No. Please try again.");
					break;
			
			case 2: System.out.println("Wrong. Try once more.");
					break;
				
			case 3: System.out.println("Don't give up!");
					break;
				
			case 4: System.out.println("No. Keep trying.");
					break;
		
		}
		
	}
	
	private static void displayCompletionMessage(double score) {
		double percentage = (score/10.0)*100;
		System.out.println(percentage + "%");
		
		if(percentage < 75.0) {
			System.out.println("Please ask your teacher for extra help.");
		}
		
		else {
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		
		System.out.println("Do you want to solve a new problem set?");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		
		if(answer == "Yes") {
			System.out.println("Please restart the program.");	//this doesn't show up
		}
		
	}
	
	private static int readDifficulty() {
		System.out.print("Please enter a difficulty level 1, 2, 3, or 4: ");
		Scanner scanner = new Scanner(System.in);
		int difficulty = scanner.nextInt();
		
		return difficulty;
	}
	
	  
	private static int generateQuestionArgument(int difficulty) {
		
		
		SecureRandom secureRandom1 = new SecureRandom();
		
		if (difficulty == 1) {
			int randomInt1 = secureRandom1.nextInt(10);
			return randomInt1;
		}
		
		else if (difficulty == 2) {
			int randomInt1 = secureRandom1.nextInt(100);
			return randomInt1;
		}
		
		else if (difficulty == 3) {
			int randomInt1 = secureRandom1.nextInt(1000);
			return randomInt1;
		}
		
		else {
			int randomInt1 = secureRandom1.nextInt(10000);
			return randomInt1;
		} 

	}
}
