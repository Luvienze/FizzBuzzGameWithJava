package fizzBuzzGame;
import java.util.Scanner;

public class FizzBuzzTest {
	public static void main(String[] args)
	{
		Scanner getUser = new Scanner(System.in);
		String answer;
		//Setting Game
		FizzBuzzV2 fizzBuzzGame1 = new FizzBuzzV2 ();
		fizzBuzzGame1.setGame("!Fizz Buzz Game!");
		
		//Setting Players
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		
		player1.setName("Daisy");
		player2.setName("Paul");
		player3.setName("Cameron");
		
		//Setting players to game
		Player players[] = {player1, player2, player3};
		fizzBuzzGame1.setPlayers(players);
		
		//Game Starts
		System.out.println(fizzBuzzGame1.game);
		fizzBuzzGame1.getRules();
		System.out.println("Enter the size of game :" );
		fizzBuzzGame1.setSizeOfGame(getUser.nextInt());
		do 
		{
			for(int i=1; i<=fizzBuzzGame1.sizeOfGame ; i++)
			{

				if(i%5 == 0 && i%3 == 0)
				{	
					System.out.print(players[0].name + " :");
					System.out.println("fizz buzz");
					i++;
				}
				if(i%3 == 0)
				{	
					System.out.print(players[1].name + " :");
					System.out.println("fizz");
					i++;
					}
				if(i%5 == 0)
				{	
					System.out.print(players[2].name + " :");
					System.out.println("fizz");
					i++;
				}
				System.out.println(i);
			}
			System.out.println("Do you want to start again? (Y/N)");
			answer = getUser.next();
		}
		while(answer == "Y" && answer != "N");
		System.out.println("Thank you for playing!!!");
	}
	
}

