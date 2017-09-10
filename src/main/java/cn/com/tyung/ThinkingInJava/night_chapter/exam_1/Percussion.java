package cn.com.tyung.ThinkingInJava.night_chapter.exam_1;

public class Percussion extends Instrument {

	@Override
	public void play(int n) {
		System.out.println("Percussion.play() "+n);
	}

	@Override
	public void adjust() {

	}
	
	public String what() {
		return "Percussion";
	}

}
