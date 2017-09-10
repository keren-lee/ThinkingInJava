package cn.com.tyung.ThinkingInJava.night_chapter.exam_1;

public class Wind extends Instrument {

	@Override
	public void play(int n) {
		System.out.println("Wind.play() "+n);
	}

	@Override
	public void adjust() {

	}
	
	public String what() {
		return "Wind";
	}

}
