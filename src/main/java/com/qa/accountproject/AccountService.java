package com.qa.accountproject;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
	private int counter;
	private Map<Integer, Account> accounts;
	
	public AccountService() {
		counter= 1;
		accounts = new HashMap<>();
	}
	
	public void addAccount(String firstName, String lastName, int accountNumber) {
		Account newCustomerAccount= new Account(firstName, lastName, accountNumber);
		accounts.put(counter,newCustomerAccount);
		counter++;
	}
	
	public Account getAccount(int customerCode) {
		
		return accounts.get(customerCode);
	}

}
