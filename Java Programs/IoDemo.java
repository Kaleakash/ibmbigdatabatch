import java.io.*;
class Employee implements Serializable{
	int id;
	String name;
	float salary;
	Employee() {}
	Employee(int id, String name, float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void display() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		
	}
}
class IoDemo {
	public static void main(String args[]) throws Exception{
	Employee emp = new Employee(1,"Ravi",12000);
	emp.display();

	FileOutputStream fos = new FileOutputStream("emp.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(emp);		
	System.out.println("Serializable done successfully....");
	
	FileInputStream fis = new FileInputStream("emp.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object obj= ois.readObject();
	Employee e = (Employee)obj;
	e.display();
	}
}