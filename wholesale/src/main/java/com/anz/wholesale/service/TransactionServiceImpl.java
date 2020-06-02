package com.anz.wholesale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.wholesale.entity.TransactionEntity;
import com.anz.wholesale.entity.UserAccountEntity;
import com.anz.wholesale.exception.AccountException;
import com.anz.wholesale.exception.ValidatorException;
import com.anz.wholesale.repository.TransactionRepository;
import com.anz.wholesale.repository.UserAccountRepository;

@Service
public class TransactionServiceImpl implements TransactionService{
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Autowired
	private UserAccountRepository userAccountRepository;
	
	public List<UserAccountEntity> getAllUser(){
		return userAccountRepository.findAll();
	}
	
	public List<TransactionEntity> viewTransactionDetail(long accountNumber) throws AccountException,ValidatorException  
	{   List<TransactionEntity> trans=transactionRepository.findByAccountNumber(accountNumber);
		if(!Validator.validateAccountNumber(accountNumber))
		throw new ValidatorException("Sorry!!! Enter Correct Account Number");
		
		if(trans.isEmpty())
			throw new AccountException("Sorry!!! No Transaction Available For This Particular Account Number");
		return trans;
		
	
	}

}
