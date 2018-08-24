package com.capgemini.onlinebanking.dao;

import com.capgemini.onlinebanking.entity.Account;
import com.capgemini.onlinebanking.exception.CustomExcep;


public class AccountDaoImpl implements AccountDao {
	static int accNum=99764;
	Account account=null;
	@Override
	public int addAccount(Account acc) throws CustomExcep {
		try {
				account=acc;
				accNum++;
	acc.setAccNum(accNum);
	return accNum;
		}
		catch(Exception e){
			throw new CustomExcep("Sorry coult not add a record",e);
			
			
		}
		}
	}
	
