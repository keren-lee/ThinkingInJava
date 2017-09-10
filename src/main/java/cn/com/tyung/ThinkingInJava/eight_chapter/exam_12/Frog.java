package cn.com.tyung.ThinkingInJava.eight_chapter.exam_12;

public class Frog extends Amphibian {
	private Characteristic c = new Characteristic("Croaks");
	private Description d = new Description("Eat Bugs");
	
	public Frog() {
		System.out.println("Frog()");
	}
	
	protected void dispose() {
		System.out.println("Frog Dispose");
		d.dispose();
		c.dispose();
		super.dispose();
	}
	
	
	public static void main(String[] args) {
		Frog frog = new Frog();
		System.out.println("bye");
		frog.dispose();
	}
	
}
