package cn.com.tyung.ThinkingInJava.eight_chapter.exam_12;

/**
 * 类的成员变量初始化和销毁的顺序相反
 * 创建顺序：先从父类开始，父类中的成员变量先初始化，按照声明的顺序，然后是父类的构造器，依次类推。
 * 销毁顺序：先从子类开始，子类构造器，成员变量，依次类推。
 * @author Administrator
 *
 */
public class Animal extends LivingCreature {
	
	private Characteristic c = new Characteristic("has heart");
	private Description d = new Description("Animal not Vegetable");
	
	Animal() {
		System.out.println("Animal()");
	}
	
	protected void dispose() {
		System.out.println("Animal Dispose");
		d.dispose();
		c.dispose();
		super.dispose();
	}
}
