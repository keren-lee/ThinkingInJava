package cn.com.tyung.exam_14;

/**
 * 继承中构造器调用顺序：从父类开始再到子类，依次递归。
 * 方法调用顺序：从子类开始再到父类，依次递归，在构造器内调用也是如此。
 * 因此，父子类的结构中调用重载的方法时（子类的方法覆盖父类的方法），
 * 需要注意对象有没有初始化了，然后才能确认能否调用该方法。
 * @author Administrator
 *
 */
public class PloyConstructors {
	
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}
