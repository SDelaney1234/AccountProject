package com.qa.accountproject;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class AccountService {
	private int counter;
	private Map<Integer, Account> accounts;
	
	public AccountService() {
		counter= 1;
		accounts = new HashMap<>();
	}
	
	public void addAccount(Account customer) {
		//Account newCustomerAccount= new Account(firstName, lastName, accountNumber);
		accounts.put(counter,customer); 
		counter++;
	}
	
	public Account getAccount(int customerCode) {
		
		return accounts.get(customerCode);
	}
	
	public JSONObject convertMapToJson() {
		return new JSONObject(accounts);
	}

}
