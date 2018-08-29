package com.qa.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.qa.account.Account;

public class MapOffline implements IService {
	
	
	private Map<Integer, Account>accountMap = new HashMap<Integer, Account>();

	@Override
	public Account findAnAccount(Account account) {
		account = accountMap.get(account.getId());
		return account;
	}

	@Override
	public String createAnAccount(Account account) {
		accountMap.put(account.getId(), account);
		return "{\"message\": \"account sucessfully created\"}";
	}

	@Override
	public String deleteAnAccount(Account account) {
		accountMap.remove(account.getId());
		return "{\"message\": \"account sucessfully deleted\"}";
	}

	@Override
	public String updateAnAccount(Account account) {
		accountMap.replace(account.getId(), account);
		return "{\"message\": \"account sucessfully updated\"}";
	}

	@Override
	public Collection<Account> findAllAccounts() {
		return accountMap.values();
	}
	
	

	
}
