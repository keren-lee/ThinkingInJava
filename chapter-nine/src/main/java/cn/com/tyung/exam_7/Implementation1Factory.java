package cn.com.tyung.exam_7;

public class Implementation1Factory implements ServiceFactory {

	@Override
	public Service getService() {
		
		return new Implementation1();
	}

}
