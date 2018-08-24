package com.capgemini.onlinebanking.service;

import java.util.ArrayList;

import com.capgemini.onlinebanking.dao.AccountDao;
import com.capgemini.onlinebanking.dao.AccountDaoImpl;
import com.capgemini.onlinebanking.entity.Account;

public class AccountServiceImpl implements AccountService {
	private AccountDao serviceDao;
	private ArrayList<Account> mylist;
	public AccountServiceImpl() {
		serviceDao=new AccountDaoImpl();
	}	

	@Override
	public int addAccount(Account acc) {
		int accNum=serviceDao.addAccount(acc);
		return accNum;
	}

}
