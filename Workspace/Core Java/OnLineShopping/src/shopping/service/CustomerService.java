package shopping.service;

import shopping.bean.Customer;
import shopping.dao.CustomerDao;

public class CustomerService {

	public String storeCustomerInfo(Customer cc) {
		CustomerDao cd = new CustomerDao();
		if(cd.createCustomerInfo(cc)>0) {
			return "Cusomter Account Created";
		}else {
			return "Account didnt' create";
		}
	}
	
	public String checkCustomerInfo(Customer cc) {
		CustomerDao cd  = new CustomerDao();
		if(cd.checkCustomerInfo(cc)) {
			return "success";
		}else {
			return "Failure";
		}
	}
}
