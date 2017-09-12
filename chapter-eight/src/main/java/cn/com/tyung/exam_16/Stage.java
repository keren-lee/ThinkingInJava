package cn.com.tyung.exam_16;

public class Stage {
	
	private Actor actor = new HappyActor();
	
	public void Change() {
		actor = new SadActor();
	}
	
	public void performPlay() {
		actor.act();
	}
}
