package main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		/*Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("Ravi");
		emp1.setSalary(14000);
		
		System.out.println("id is "+emp1.getId());
		System.out.println("name is "+emp1.getName());
		System.out.println("salary is "+emp1.getSalary());
		
		Employee emp2= new Employee(101, "Ajay", 16000);
		System.out.println(emp2);*/
		
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(1, "Ravi", 15000));
		listOfEmp.add(new Employee(3, "Ajay", 12000));
		listOfEmp.add(new Employee(2, "Vijay", 10000));
		listOfEmp.add(new Employee(4, "Mahesh", 18000));
		System.out.println("Number of records are "+listOfEmp.size());
		Employee emp1 = listOfEmp.get(1);
		System.out.println(emp1.getId()+", "+emp1.getName()+", "+emp1.getSalary());
		//System.out.println(emp1);
		listOfEmp.remove(2);
		ListIterator<Employee> ll = listOfEmp.listIterator();
		while(ll.hasNext()) {
			Employee emp = ll.next();
			System.out.println(emp);
		}
	}

}
