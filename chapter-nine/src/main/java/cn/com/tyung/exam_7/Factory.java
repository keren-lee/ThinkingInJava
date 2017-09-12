package cn.com.tyung.exam_7;

public class Factory {
	
	public static void serviceCustomer(ServiceFactory factory) {
		Service s = factory.getService();
		s.method1();
		s.method2();
	}
	
	public static void main(String[] args) {
		serviceCustomer(new Implementation1Factory());
		serviceCustomer(new Implemetation2Factory());
	}
}
