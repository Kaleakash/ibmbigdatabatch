class Employee {
	int id;
	private Employee() {

	}
	private final static Employee emp = new Employee();
	public static Employee getInstance() {
		
		return emp;
	} 
	void display() {
		System.out.println("Business method "+id);
	}
}
class SingletonDemo {
	public static void  main(String args[]) {
		//Employee emp3 = Employee.emp;
		Employee emp1 = Employee.getInstance();
		Employee emp2 = Employee.getInstance();
		emp1.id=100;
		emp1.display();
		emp2.display();	
	}
}