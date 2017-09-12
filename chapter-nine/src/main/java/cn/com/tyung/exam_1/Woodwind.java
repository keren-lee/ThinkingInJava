package cn.com.tyung.exam_1;

public class Woodwind extends Wind {
	public void play(int n) {
		System.out.println("Woodwind.play() "+n);
	}
	
	public String what() {
		return "Woodwind";
	}
}
