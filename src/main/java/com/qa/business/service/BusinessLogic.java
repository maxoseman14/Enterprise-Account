package com.qa.business.service;

import java.util.Collection;

import javax.inject.Inject;

import com.google.gson.Gson;
import com.qa.account.Account;
import com.qa.repository.IService;

public class BusinessLogic {
	
	@Inject
	private IService iservice;
	
	
	public String blockedAccount (String jSONaccount) {
		
		Gson gson = new Gson();
		Account account = gson.fromJson(jSONaccount, Account.class);
		String error = "";
		
		if(iservice.findAnAccount(account).getAccountnumber() == 9999) {
			return "{\"message\": \"this account is blocked\"}";
		} else {
			return iservice.createAnAccount(account);
		}
	}
	
	public String createAccount (String jSONaccount)
	{
		Gson gson = new Gson();
		Account account = gson.fromJson(jSONaccount, Account.class);
		return iservice.createAnAccount(account);
	}
	
	public String deleteAccount (String jSONaccount)
	{
		Gson gson = new Gson();
		Account account = gson.fromJson(jSONaccount, Account.class);
		return iservice.deleteAnAccount(account);
	}
	
	public Account findAnAccount (String jSONaccount)
	{
		Gson gson = new Gson();
		Account account = gson.fromJson(jSONaccount, Account.class);
		return iservice.findAnAccount(account);
	}
	
	public Collection<Account> findAllAccounts()
	{
		return iservice.findAllAccounts();
	}
	

}
