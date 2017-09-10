package cn.com.tyung.ThinkingInJava.night_chapter.exam_2;

public class Apply {
	
	public static void process(Processor p,Object o) {
		System.out.println("Useing processor "+p.name());
		System.out.println(p.process(o));
	}
	
	public static String s = "Disagreement with belivefs is by definition incorrect";
	
	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
}
