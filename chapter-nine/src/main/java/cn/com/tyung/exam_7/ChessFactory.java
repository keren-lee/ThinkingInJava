package cn.com.tyung.exam_7;

public class ChessFactory implements GameFactory {

	@Override
	public Game getGame() {
		
		return new Chess();
	}

}
