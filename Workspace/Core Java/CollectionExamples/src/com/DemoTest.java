package com;
class A implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("i "+i);
		}
	}
	
}
class B implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j=0;j<10;j++) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}

			System.out.println("j "+j);
		}
	}
	
}
class Emp {
	void display() {
		System.out.println("display method");
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before GC");
	}
}
public class DemoTest {

	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.display();
		emp =null;
		System.gc();
		System.out.println("Simple Message");
		System.out.println("Simple Message");
		System.out.println("Simple Message");
		/*A obj1 = new A();
		B obj2 = new B();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t2.setDaemon(true);
		t1.start();
		t2.start();
*/
	}

}
