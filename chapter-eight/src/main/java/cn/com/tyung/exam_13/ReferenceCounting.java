package cn.com.tyung.exam_13;
/**
 * 共享对象销毁时机，需要根据实际的情况进行销毁，不能随意调用其销毁方法进行销毁。
 * 因为如果销毁了该对象，后面需要用到的地方就无法再使用该对象。
 * @author Administrator
 *
 */
public class ReferenceCounting {
	
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composings = {new Composing(shared),
								new Composing(shared),
								new Composing(shared),
								new Composing(shared)};
		for(Composing c:composings) {
			c.dispose();
		}
	}
}
