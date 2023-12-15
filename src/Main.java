import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to today's Wordle!");
        System.out.print("Enter your name: ");
        String playerName = scan.nextLine();
        System.out.println("Welcome! " + playerName + " Let's play Wordle.");
        WordleGame game = new WordleGame();
        game.playGame();
    }
}