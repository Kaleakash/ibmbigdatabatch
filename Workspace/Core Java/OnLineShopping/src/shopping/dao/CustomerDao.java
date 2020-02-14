package shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import shopping.bean.Customer;
import shopping.resource.DbResource;

public class CustomerDao {

	public int createCustomerInfo(Customer cus) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = 
			con.prepareStatement("insert into customer values(?,?)");
			pstmt.setString(1, cus.getCname());
			pstmt.setString(2, cus.getPassword());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("CreateCust Dao Method "+e);
			return 0;
		}
	}
	
	public boolean checkCustomerInfo(Customer cus) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = 
			con.prepareStatement("select * from customer where cname =? and password = ?");
			pstmt.setString(1, cus.getCname());
			pstmt.setString(2, cus.getPassword());
			ResultSet rs = pstmt.executeQuery();
			return rs.next();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Customer Check dao Method "+e);
			return false;
		} 
	}
	
}
