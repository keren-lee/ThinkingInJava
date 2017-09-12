package cn.com.tyung.exam_1;

public class Stringed extends Instrument {

	@Override
	public void play(int n) {
		System.out.println("Stringed.play() "+n);
	}

	@Override
	public void adjust() {

	}
	
	public String what() {
		return "Stringed";
	}

}
