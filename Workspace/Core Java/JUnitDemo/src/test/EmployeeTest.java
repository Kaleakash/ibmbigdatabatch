package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class EmployeeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before all test");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After all test");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before each test method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After each test method");
	}

	@Test
	@Ignore
	public void testGetId() {
		//fail("Not yet implemented");
		System.out.println("While testing first test");
	}

	@Test
	public void testSetId() {
		//fail("Not yet implemented");
		System.out.println("While testing second test");
	}

}
