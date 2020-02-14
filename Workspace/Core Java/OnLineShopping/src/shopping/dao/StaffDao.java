package shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import shopping.bean.Staff;
import shopping.resource.DbResource;

public class StaffDao {

	public int createStaffInfo(Staff ss) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = 
			con.prepareStatement("insert into staff values(?,?)");
			pstmt.setString(1, ss.getSname());
			pstmt.setString(2, ss.getPassword());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Create Staff Dao Method "+e);
			return 0;
		}
	}
	
	public boolean checkStaffInfo(Staff sf) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = 
			con.prepareStatement("select * from staff where sname =? and password = ?");
			pstmt.setString(1, sf.getSname());
			pstmt.setString(2, sf.getPassword());
			ResultSet rs = pstmt.executeQuery();
			return rs.next();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Staff Check dao Method "+e);
			return false;
		} 
	}
	
	
}
