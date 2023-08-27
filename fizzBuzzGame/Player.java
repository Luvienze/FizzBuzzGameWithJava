package fizzBuzzGame;

public class Player {
	String name;
	String answer;
	FizzBuzzV2 fizzBuzzPlayer;
	
	{
		name = "Unnamed Player";
	}
	
	void setName (String name) {
		this.name = name;
	}
	void setPlayerToGame (FizzBuzzV2 fizzBuzzPlayer) {
		this.fizzBuzzPlayer = fizzBuzzPlayer;
	}
	
	void play(String answer) {
		this.answer = answer;
	}

}
