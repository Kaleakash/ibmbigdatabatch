class Employee {	
	int id;
	String name;
	Employee() {
		id=123;
		name="Abc";	// from file, from database with condition 
	}
	Employee(int id) {
		this();
		this.id=id;
		//name = "Abc";
	}
	Employee(int id, String name) {
		this(id);
		//this.id = id;
		this.name = name;
	}
	void dis() {
		System.out.println("id is "+id+" name "+name);
	}
}
class ThisDemo {
	public static void main(String args[]) {
	Employee e1 = new Employee();	e1.dis();
	Employee e2 = new Employee(1);	e2.dis();
	Employee e3 = new Employee(2,"Ravi");	e3.dis();
	}
}