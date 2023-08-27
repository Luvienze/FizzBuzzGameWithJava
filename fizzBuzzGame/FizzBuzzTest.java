package fizzBuzzGame;
import java.util.Scanner;

public class FizzBuzzTest {
	public static void main(String[] args)
	{
		int a = 0;
		String answer;
		Scanner getUser = new Scanner(System.in);
		//Setting Game
		FizzBuzzV2 fizzBuzzGame1 = new FizzBuzzV2 ();
		fizzBuzzGame1.setGame("!Fizz Buzz Game!");
		
		//Setting Players
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		
		player1.setName("Daisy");
		player2.setName("Paul");
		player3.setName(null);
		
		//Setting players to game
		Player players[] = {player1, player2, player3};
		fizzBuzzGame1.setPlayers(players);
		
		//Game Starts
		System.out.println(fizzBuzzGame1.game);
		do 
		{
			for(int i=1; i<100; i++)
			{
				for(int j=0; j<fizzBuzzGame1.players.length;j++)
				{
					players[j].play(getUser.next());
					if(i%5 == 0 && i%3 == 0)
					{
						answer = "fizz buzz";
						answer = Integer.toString(i);
						if(players[j].answer == answer) 
						{
							i++;
						}
						else
						{
							System.out.println("Player lost.");
						}
					}
					if(i%3 == 0)
					{	
						answer = "fizz";
						answer = Integer.toString(i);
						if(players[j].answer == answer)
						{
							i++;
						}
						else
						{
							System.out.println("Player lost.");
						}
					}
					if(i%5 == 0)
					{	
						
						answer = "buzz";
						answer = Integer.toString(i);
						if(players[j].answer == answer)
						{
							i++;
						}
						else
						{
							System.out.println("Player lost.");
						}
					}
					
				}
			}
		}
		while(a==1);
	}
}
