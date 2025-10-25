/**
 * 
 */
package errorschallenge;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class PubQuiz {
	final static String RED = "\033[0;31m";
	final static String GREEN = "\033[0;32m";
	final static String BOLD = "\033[1m";
	final static String RESET = "\033[0m";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// import scanner (object)

		Scanner scanner = new Scanner(System.in);

		// add try/catch exception

		try {

			// create questions and and answers - array

			String[] quizQuestions = { "Capital of Ireland?", "How many bones are in the human body?",
					"Smallest city in the world?" };
			String[] quizAnswers = { "Dublin", "206", "The Vatican" };

			// declare vars for quiz

			Random random = new Random();
			String userInput;
			String anotherQuestion;

			// print title

			System.out.println(BOLD + "General Knowledge Quiz!" + RESET);

			// wrap the game in a loop

			// ask user if they want to keep playing

			do {

				// randomise questions
				int questionIndex;
				questionIndex = random.nextInt(quizQuestions.length);

				// print random question

				System.out.println(quizQuestions[questionIndex]);
				System.out.println("Your answer:");

				// store input

				userInput = scanner.nextLine();

				// check if answer is right

				if (userInput.equalsIgnoreCase(quizAnswers[questionIndex])) {
					System.out.println(GREEN + "Correct!" + RESET + " Well done.");
				} else {
					System.out.println(RED + "Incorrect!" + RESET + " But nice try.");

				}

				System.out.println("Another question? (Y or N)");
				anotherQuestion = scanner.nextLine();

			} while (anotherQuestion.equalsIgnoreCase("Y"));

		} catch (Exception exception) {
			System.out.println("Unexpcted error");
			System.out.println(exception.getMessage());

			// end quiz
		} finally {
			scanner.close();
			System.out.println(BOLD + "Thanks for playing :)" + BOLD);
		}

	}
}