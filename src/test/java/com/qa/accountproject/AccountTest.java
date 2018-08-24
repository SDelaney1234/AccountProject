package com.qa.accountproject;

import static org.junit.Assert.*;

import org.junit.Test;


public class AccountTest {
	
	@Test
	public void amountOfAccountsTest() {
		Account seb= new Account("Sebastien","Delaney",1234);
		Account jim= new Account("Jim","Johnson",1235);
		Account seb2= new Account("Sebastien","Bobson",1236);
		Account mary= new Account("Mary","Shelly",1247);
		Account seb3= new Account("Sebastien","TheUnsullied",1238);
		
		AccountService service= new AccountService();
		service.addAccount(seb);
		service.addAccount(jim);
		service.addAccount(seb2);
		service.addAccount(mary);
		service.addAccount(seb3);
		
		int actualResult= service.getAccountCountByName("Sebastien");
		
		assertEquals(3,actualResult);
		
	}
	
	
	
}
