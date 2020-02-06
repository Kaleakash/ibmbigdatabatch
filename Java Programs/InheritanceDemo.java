class Employee {
	int id;
	String name;
	float salary;
	Employee() {
		id=123;	
		name="Unknown";
		salary =8000;		
	}
	Employee(int id) {
		this();
		this.id = id;
	}
	Employee(int id, String name) {
		this(id);
		this.name = name;
	}	
	Employee(int id, String name, float salary) {
		this(id,name);
		this.salary = salary;
	}
	void dis() {
		System.out.println("id is "+id+" name is "+name+" salary is "+salary);
	}
}
class Manager extends Employee {
	int numberOfEmp;
	Manager(int id, String name, float salary, int numberOfEmp) {
		super(id,name,salary);
		this.numberOfEmp = numberOfEmp;
	}
	void disMgr() {
			System.out.println("Number of emp "+numberOfEmp);
	}
}
class InheritanceDemo {
	public static void main(String args[]){
	Employee emp1 = new Employee();	emp1.dis();
	Employee emp2= new Employee(1);	emp2.dis();
	Employee emp3= new Employee(2,"Ravi");	emp3.dis();
	Employee emp4= new Employee(3,"Raju",12000);	emp4.dis();
	Manager mgr = new Manager(4,"Dinesh",45000,5);
	mgr.dis();
	mgr.disMgr();
	}
}