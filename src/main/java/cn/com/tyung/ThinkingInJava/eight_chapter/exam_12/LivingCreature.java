package cn.com.tyung.ThinkingInJava.eight_chapter.exam_12;

public class LivingCreature {
	
	private Characteristic c = new Characteristic("is alive");
	private Description d = new Description("Basic Living Creature");
	
	LivingCreature() {
		System.out.println("LivingCreature()");
	}
	
	protected void dispose() {
		System.out.println("LivingCreature Dispose");
		d.dispose();
		c.dispose();
	}
}
