package ch8java6thedition;
import java.util.Scanner;
/**
 * 12. Heads or Tails Game
 * 
 * This game is meant for two or more players. In this game,
 * the players take turns flipping a coin. Before the coin is
 * flipped, the players should guess whether the coin will 
 * land face up or face down. If a player guesses correctly, 
 * then that player is awarded a point. If a player guesses
 * incorrectly, then the player will lose a point. The first
 * player to get 5 points wins. 
 * 
 * Write a program that simulates the game being played by two
 * players. Use the Coin class written in chapter 6 to simulate
 * the coin. Write a Player class to simulate the players. 
 * 
 * @author craig
 * 2-12-21
 * 6:41am
 * 
 */

public class HeadsOrTails {
	public static void main(String[]args) {
		String answer;

		Scanner input = new Scanner(System.in);

		// Create som players
		CoinPlayer player1 = new CoinPlayer(0);
		CoinPlayer player2 = new CoinPlayer(0);

		// Make a coin
		Coin coin = new Coin();

		System.out.println("This is a coin tossing game between two players. "
			+ "\nCall heads or tails before "
			+ "the flip. If you guess right, \nyou get a point."
			+ "The first player to get 5 points wins.\n");

		while(player1.getPoints() != 5 && player2.getPoints() != 5) {
			System.out.println("Call heads or tails...(type \"heads\" or \"tails\".");
			System.out.println("Player 1: ");
			answer = input.nextLine();
			
			coin.toss();
			if(answer.equalsIgnoreCase(coin.getSideUp())) {
				player1.incrementPoints();
				System.out.println("It landed on " + coin.getSideUp()
					 	   + "\nPlayer 1 gets a point!");
				System.out.println("\tPlayer 1 points: " + player1.getPoints()
						   + "\tPlayer 2 points: " + player2.getPoints()+"\n");

			}
			else {
				player2.incrementPoints();
				System.out.println("It landed on " + coin.getSideUp()
						  + "\nPlayer 2 gets a point!");
				System.out.println("\tPlayer 1 points: " + player1.getPoints()
						   + "\tPlayer 2 points: " + player2.getPoints()+"\n");

			}
			
			if(player1.getPoints() == 5)
				break;
			else if(player2.getPoints() == 5)
				break;
			else
				System.out.println("Moving on...");
				

			System.out.println("Call heads or tails...(type \"heads\" or \"tails\".");
			System.out.println("Player 2: ");
			answer = input.nextLine();

			coin.toss();
			if(answer.equalsIgnoreCase(coin.getSideUp())) {
				player2.incrementPoints();
				System.out.println("It landed on " + coin.getSideUp()
						   + "\nPlayer 2 gets a point!");
				System.out.println("\tPlayer 1 points: " + player1.getPoints()
						   + "\tPlayer 2 points: " + player2.getPoints()+"\n");
			}
			else {
				player1.incrementPoints();
				System.out.println("It landed on " + coin.getSideUp()
						   + "\nPlayer 1 gets a point!");
				System.out.println("\tPlayer 1 points: " + player1.getPoints()
						   + "\tPlayer 2 points: " + player2.getPoints()+"\n");

			}

			if(player1.getPoints() == 5)
				break;
			else if(player2.getPoints() == 5)
				break;
			else
				System.out.println("Moving on...");

		}

		if(player1.getPoints() == 5) {
			System.out.println("Player 1 wins!");
		}
		else if(player2.getPoints() == 5) {
			System.out.println("Player 2 wins!");
		}
	}	
}
