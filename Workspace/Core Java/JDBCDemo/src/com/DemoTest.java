package com;
import java.sql.*;
public class DemoTest {

	public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded successfully...");
		Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "system","tiger");
		System.out.println("Connected successfully....");
		Statement stmt = con.createStatement();
		System.out.println("Statement created..");
		/*
		 * Retrieve records 
		ResultSet rs = stmt.executeQuery("select * from employee");
		while(rs.next()) {
		System.out.println("Id is "+rs.getInt("id"));
		System.out.println("Name is "+rs.getString(2));
		System.out.println("salary is "+rs.getFloat(3));
		}
		rs.close();
		*/
		// Insert Record 
		/*int res = 
		stmt.executeUpdate("insert into employee values(5,'Dinesh',16000)");
		if(res>0) {
			System.out.println("Record inserted successfully...");
		}*/
		//Delete query 
		/*int res  = stmt.executeUpdate("delete from employee where id =1");
		if(res>0) {
			System.out.println("Record deleted successfully");
		}else {
			System.out.println("Record is not available");
		}*/
		/*int res  = 
	stmt.executeUpdate("update employee set salary = salary+800 where id=5");
		if(res>0) {
			System.out.println("Record updated successfully");
		}else {
			System.out.println("Record is not available");
		}*/
		
		stmt.close();
		con.close();
	} catch (Exception e) {
	System.err.println(e);
	}
	}

}
