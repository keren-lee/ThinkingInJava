package cn.com.tyung.exam_6;

public class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;
	@Override
	public boolean move() {
		System.out.println("Chess move "+moves);
		return ++moves != MOVES;
	}
	
	public static GameFactory factory = new GameFactory() {
		
		@Override
		public Game getGame() {
			return new Chess();
		}
	};
}
