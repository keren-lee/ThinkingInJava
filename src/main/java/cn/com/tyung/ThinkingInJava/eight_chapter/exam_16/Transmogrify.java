package cn.com.tyung.ThinkingInJava.eight_chapter.exam_16;

/**
 * 继承与组合相比，首选组合模式。
 * 组合模式不会强制我们的程序进入继承结构中
 * 而且，组合更加灵活，因为他可以动态选择类型，也就有了动态的行为选择。
 * 相反，继承在编译时就需要知道确切的类型。
 * @author Administrator
 *
 */
public class Transmogrify {
	
	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.Change();
		stage.performPlay();
	}
}
