package fizzBuzzGame;

public class FizzBuzzV2 {
	String game;
	int sizeOfGame;
	Player[] players;
	Player answer;
	
	void setGame (String game) {
		this.game = game;
	}
	void setSizeOfGame(int sizeOfGame) {
		this.sizeOfGame = sizeOfGame;
	}
	void setPlayers(Player[] players) {
		this.players = players;
	}
	void getRules() {
		System.out.println("      RULES OF THE GAME      ");
		System.out.println(" Game can be playable by 3 person. ");
		System.out.println(" Number divisible by three with word is 'fizz' .");
		System.out.println(" Number divisible by five with word is 'buzz' .");
		System.out.println(" Number divisible both by five and three with word is 'fizz buzz'. ");
	}
}
