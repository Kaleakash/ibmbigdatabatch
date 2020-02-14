class Employee {
	int id;
	private Employee() {

	}

	public static Employee getInstance() {
		Employee emp = new Employee();
		return emp;
	} 
	void display() {
		System.out.println("Business method "+id);
	}
}

class SingletonDemo {
	public static void  main(String args[]) {
		Employee emp1 = Employee.getInstance();
		Employee emp2 = Employee.getInstance();
		emp1.id=100;
		emp1.display();
		emp2.display();	
	}
}