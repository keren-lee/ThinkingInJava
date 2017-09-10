package cn.com.tyung.ThinkingInJava.night_chapter.exam_3;
/**
 * 适配器设计模式
 * @author Administrator
 *
 */
public class FilterAdapter implements Processor {
	Filter filter;
	
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}
	
	@Override
	public String name() {
		
		return filter.name();
	}

	@Override
	public Wavefrom process(Object input) {
		
		return (Wavefrom)input;
	}

}
