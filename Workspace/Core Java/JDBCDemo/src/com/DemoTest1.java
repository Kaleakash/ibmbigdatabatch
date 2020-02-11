package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DemoTest1 {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "system","tiger");
		//Statement stmt  = con.createStatement();		
		PreparedStatement pstmt = 
				con.prepareStatement("insert into employee values(?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = sc.nextInt();
		pstmt.setInt(1, id);
		System.out.println("Enter the name");
		String name = sc.next();
		pstmt.setString(2, name);
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
		pstmt.setFloat(3, salary);
		int res = pstmt.executeUpdate();
		if(res>0) {
			System.out.println("REcord inserted successfully..");
		}
		/*int res = stmt.executeUpdate("insert into employee values("+id+",' "+name+" ',"+salary+")");
		if(res>0) {
			System.out.println("Recod inserted successfully");
		}
		stmt.close();*/
		con.close();
	}

}
