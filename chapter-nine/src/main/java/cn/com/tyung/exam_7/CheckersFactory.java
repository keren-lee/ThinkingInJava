package cn.com.tyung.exam_7;

public class CheckersFactory implements GameFactory {

	@Override
	public Game getGame() {
		
		return new Checkers();
	}

}
