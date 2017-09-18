package cn.com.tyung.exam_6;

public class Factories {
	
	public static void serviceCustomer(ServiceFactory factory) {
		Service service = factory.getService();
		service.method1();
		service.method2();
	}
	
	public static void main(String[] args) {
		serviceCustomer(Implementation1.getFactory());
		serviceCustomer(Implementation2.factory);
	}
}
