package shopping.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import shopping.bean.Customer;

public class CustomerServiceTest {
	Customer cc;
	@BeforeClass
	public void beforeClass() {
		cc = new Customer();
	}
	@Test
	public void testCheckCustomerInfo() {
		System.out.println("Customer Testing");
	}

}
