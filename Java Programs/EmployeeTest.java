import java.util.Scanner;
class Employee {
	private String name;
	private float salary;
	void setEmpInfo(String name, float salary) {
		this.name = name;
		//this.salary = salary;
		if(salary<0) {
			this.salary =8000;
		}else {
			this.salary = salary;
		}
	}
	void display() {
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
	}	
}
class EmployeeTest {
	public static void main(String args[]) {
	Employee emp1 = new Employee();
	//emp1.name="Ravi";
	//emp1.salary=-12000;
	emp1.setEmpInfo("Ravi",-12000);
	emp1.display();	
	}
}