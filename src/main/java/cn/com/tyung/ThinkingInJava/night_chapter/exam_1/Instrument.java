package cn.com.tyung.ThinkingInJava.night_chapter.exam_1;

public abstract class Instrument {
	private int i;
	
	public abstract void play(int n);
	
	public String what() {
		return "Instrument";
	}
	
	public abstract void adjust();
}
