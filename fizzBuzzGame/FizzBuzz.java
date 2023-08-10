package fizzBuzzGame;
import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args)
	{
		Scanner userAnswer = new Scanner(System.in);
		int answer;
		do
		{
			System.out.println("FizzBuzz Game Stars");
			for(int i = 1; i < 100; i++)
			{
				if(i%5 == 0 && i%3 == 0)
				{
					System.out.println("fizz buzz");
					i++;
				}
				if(i%3 == 0)
				{
					System.out.println("fizz");
					i++;
				}
				if(i%5 == 0)
				{
					System.out.println("buzz");
					i++;
				}
				System.out.println(i);
		
			}
			System.out.println("Do you want to continue? (1/2)");
			answer = userAnswer.nextInt();
			
		}
		while(answer == 1 && answer != 2);
	}

	
	
}
