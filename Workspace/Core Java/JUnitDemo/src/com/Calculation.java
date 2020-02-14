package com;

public class Calculation {

	public int add(int x, int y) {
		return x+y;
	}
	
	public float empInfo(Employee emp) {
		//coding 
		
		return emp.getSalary()+2000;
	}
	
	public Employee getEmpInfo() {
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Ajay");
		emp.setSalary(16000);
		return emp;
	}
	
	int n;		//old value is 0, after call value not equal to 0
	public void passValue(int x) {
		int a =x;
		System.out.println(a);
		//coding 
		
		//with condition , file handling 
		n=x;
	}
}
