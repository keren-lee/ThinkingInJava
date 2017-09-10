package cn.com.tyung.ThinkingInJava.eight_chapter.exam_11;

/**
 * 继承调用构造器规则：首先调用父类的构造器，此动作会不断重复递归下去，直到最底层的父类。
 * 对象成员变量调用规则：按照声明顺序调用成员变量的初始化方法。
 * 最后调用最底层子类的构造方法。
 * @author Administrator
 *
 */
public class Sandwich extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	
	public Sandwich() {
		System.out.println("Sandwich()");
	}
	
	public static void main(String[] args) {
		new Sandwich();
	}
}
