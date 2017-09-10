package cn.com.tyung.ThinkingInJava.night_chapter.exam_1;

public class Music4 {
	
	static void tune(Instrument i) {
		i.play(1);
	}
	
	static void tuneAll(Instrument[] is) {
		for(Instrument i:is) {
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
	}
}
