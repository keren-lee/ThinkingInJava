package cn.com.tyung.exam_3;
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
	
	public String name() {
		
		return filter.name();
	}
	
	public Wavefrom process(Object input) {
		
		return (Wavefrom)input;
	}

}
