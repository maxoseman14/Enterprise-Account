package com.qa.repository;

import java.util.Collection;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.mapping.List;

import com.google.gson.Gson;
import com.qa.account.Account;



@Transactional
public class AccountDBImpl implements IService {
	
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
    

	public Account findAnAccount(Account account) {
    	return manager.find(Account.class, account.getId());
	}
	
	public String createAnAccount(Account account) {
		manager.remove(account);
        return "{\"message\": \"account sucessfully deleted\"}";
	}


	public String deleteAnAccount(Account account) {
		manager.remove(account);
        return "{\"message\": \"account sucessfully deleted\"}";
	}

	
	public Collection<Account> findAllAccounts() {
		TypedQuery<Account> query = manager.createQuery("SELECT m FROM Account m ORDER BY m.id", Account.class);
        return query.getResultList();
	}
	
	public String updateAnAccount (Account account) {
    	return "{\"message\": \"account sucessfully updated\"}";
    	
    }

    


 }



