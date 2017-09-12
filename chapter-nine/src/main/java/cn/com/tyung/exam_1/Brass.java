package cn.com.tyung.exam_1;

public class Brass extends Instrument {

	@Override
	public void play(int n) {
		System.out.println("Brass.play() "+n);
	}

	@Override
	public void adjust() {
		System.out.println("Brass.adjust() ");
	}

}
