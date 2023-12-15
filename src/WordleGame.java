import java.util.Scanner;

public class WordleGame {
    private String targetWord;
    private int attemptsLeft;
    private String feedback;
    private Scanner scanner;

    public WordleGame() {
        this.targetWord = "APPLE";
        this.attemptsLeft = 6;
        this.feedback = "";
        this.scanner = new Scanner(System.in);
    }

    public void guessWord(String guess) {
        for (int i = 0; i < guess.length(); i++) {
            char letter = guess.charAt(i);
            if (letter == targetWord.charAt(i)) {
                feedback += "";
            } else if (targetWord.contains(String.valueOf(letter))) {
                feedback += "";
            } else {
                feedback += "";
            }
        }
        attemptsLeft--;
    }

    public boolean isGameOver() {
        return attemptsLeft == 0 || targetWord.equals(feedback);
    }

    public boolean isWordGuessed() {
        return targetWord.equals(feedback);
    }

    private boolean isValidGuess(String guess) {
        return guess.length() == 5 && guess.matches("[a-zA-Z]+");
    }

    public void playGame() {
        System.out.println("Welcome to Wordle! Try to guess the 5-letter word.");

        while (!isGameOver()) {
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.print("Enter your guess: ");
            String userGuess = scanner.next().toUpperCase();

            if (isValidGuess(userGuess)) {
                guessWord(userGuess);
                System.out.println("Feedback: " + feedback);
            } else {
                System.out.println("Invalid guess. Please enter a 5-letter word with only alphabetic characters.");
            }
        }

        if (isWordGuessed()) {
            System.out.println("Congratulations! You guessed the word: " + targetWord);
        } else {
            System.out.println("Sorry, you're out of attempts. The word was: " + targetWord);
        }
    }
}
