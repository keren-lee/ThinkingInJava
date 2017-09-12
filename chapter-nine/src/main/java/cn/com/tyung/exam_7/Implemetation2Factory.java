package cn.com.tyung.exam_7;

public class Implemetation2Factory implements ServiceFactory {

	@Override
	public Service getService() {
		
		return new Implementation2();
	}

}
