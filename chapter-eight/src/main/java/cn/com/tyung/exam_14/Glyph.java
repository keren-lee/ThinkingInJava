package cn.com.tyung.exam_14;

public class Glyph {
	
	void draw() {
		System.out.println("Glyph draw()");
	}
	
	Glyph() {
		System.out.println("Glyph() befor draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}
