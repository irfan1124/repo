package test1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest2 {
	Account acc;
	@Before
	public void setUp() throws Exception {
	 acc=new Account(100);
	}

	

	@Test
	public void test() {
		
		//fail("Not yet implemented");
	//	Account acc=new Account(100);
		assertEquals(100, acc.getBal());
	}
	
	
	@Test
	public void depotest() {
		//Account acc=new Account(100);
		acc.deposit(300);
		assertEquals(300, acc.getBal());
	}
	
	@Test
	public void withdrawtest() {
		//Account acc=new Account(300);
		acc.deposit(300);
		int oldbal=acc.getBal();
		acc.withdraw(200);
		assertEquals(oldbal-200, acc.getBal());
	}
}

