package shopping.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import shopping.bean.Customer;
import shopping.bean.Staff;
import shopping.dao.CustomerDao;
import shopping.dao.StaffDao;
import shopping.resource.DbResource;

public class StaffService {

	public String storeStaffInfo(Staff ss) {
		StaffDao sd  = new StaffDao();
		if(sd.createStaffInfo(ss)>0) {
			return "Staff Account created successfuly";
		}else {
			return "Staff Account didn't create";
		}
	}
	
	
	public String checkStaffInfo(Staff sf) {
		StaffDao sd = new StaffDao();
		if(sd.checkStaffInfo(sf)) {
			return "success";
		}else {
			return "Failure";
		}
	}
}
