class Employee {

	private Employee() {

	}

	public static Employee getInstance(int id) {
		//coding 
		if(id==1) {
		Employee emp =new Employee();
		return emp;
		}
		else {
		return null;
		}
		
	} 
	void display() {
		System.out.println("Business method");
	}
}

class SimpleFactory {
	public static void  main(String args[]) {
		//Employee emp = new Employee();
		Employee emp = Employee.getInstance(1);
		try{
		emp.display();
		}catch(Exception e) {
		//System.out.println(e);
		e.printStackTrace();
		}
		System.out.println("Normal Code");
	}
}