class Car {
	String color;
	float price;
	int wheel;
	void start() {
		int temp=123;
		System.out.println("Car Start...");
		System.out.println(color);
		System.out.println(price);
		System.out.println(temp);
	}
	void stop() {
		String msg="Welcome";
		System.out.println(color);
		System.out.println(price);
		System.out.println(msg);
	}
}
class CarTest {
	public static void main(String args[]) {
	System.out.println("main method");
	//start();
	Car santro = new Car();
	santro.start();
	santro.stop();	
	}
}


