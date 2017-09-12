package cn.com.tyung.exam_15;
/**
 * 协变返回类型：在继承父子类结构中，子类中被覆盖的方法，可返回父类方法返回类型的子类型。
 * @author Administrator
 *
 */
public class CovariantReturn {
	
	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		System.out.println(g);
		m = new WheatMill();
		g = m.process();
		System.out.println(g);
	}
}
