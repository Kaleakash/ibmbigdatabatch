interface Abc {
	void dis1();
}
class Xyz implements Abc {
	public void dis1() {
		System.out.println("dis1() method");
	}
}
class InnerClassDemo {
	public static void main(String args[]) {
	Abc obj = new Xyz();
	obj.dis1();

	
	Abc obj1 = new Abc(){
	public void dis1() {
		System.out.println("dis1() method");
	}
};	

	obj1.dis1();
	}
}





