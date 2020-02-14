package com;
import static java.lang.Math.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcuationTest {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Calculation cc = new Calculation();
		int res = cc.add(10, 20);
		assertEquals(30, res);
	}

	@Test
	public void testEmpInfo() {
		Calculation cc = new Calculation();
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(12000);
		float updatedSalary = cc.empInfo(emp);
		assertEquals(14000, updatedSalary,0.0);
	}
	@Test
	public void testGetEmpInfo() {
		Calculation cc  = new Calculation();
		Employee emp = cc.getEmpInfo();
		assertNotNull(emp);
		assertEquals(101, emp.getId());
		assertEquals("Ajay", emp.getName());
		assertEquals(16000, emp.getSalary(),0.0);
	}
}
