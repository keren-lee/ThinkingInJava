package cn.com.tyung.ThinkingInJava.eight_chapter.exam_16;

public class Stage {
	
	private Actor actor = new HappyActor();
	
	public void Change() {
		actor = new SadActor();
	}
	
	public void performPlay() {
		actor.act();
	}
}
