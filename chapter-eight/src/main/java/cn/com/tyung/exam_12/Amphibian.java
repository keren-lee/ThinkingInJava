package cn.com.tyung.exam_12;

public class Amphibian extends Animal {
	private Characteristic c = new Characteristic("can live in water");
	private Description d = new Description("Both water and land");
	
	Amphibian() {
		System.out.println("Amphibian()");
	}
	
	protected void dispose() {
		System.out.println("Amphibian Dispose");
		d.dispose();
		c.dispose();
		super.dispose();
	}
}
