package cn.com.tyung.exam_6;

public class Games {
	
	public static void playGame(GameFactory factory) {
		Game game = factory.getGame();
		while(game.move()) {
			;
		}
	}
	
	public static void main(String[] args) {
		playGame(Checker.factory);
		playGame(Chess.factory);
	}
}
