package com.qa.repository;

import java.util.Collection;

import javax.transaction.Transactional;

import com.qa.account.Account;

public interface IService {
	
	public Account findAnAccount (Account account);
	public String createAnAccount (Account account);
	public String deleteAnAccount (Account account);
	public String updateAnAccount (Account account);
	public Collection<Account> findAllAccounts ();
   
}
