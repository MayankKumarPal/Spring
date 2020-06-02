package com.anz.wholesale.service;

import java.util.List;

import com.anz.wholesale.entity.TransactionEntity;
import com.anz.wholesale.entity.UserAccountEntity;
import com.anz.wholesale.exception.AccountException;
import com.anz.wholesale.exception.ValidatorException;

public interface TransactionService {
	public List<UserAccountEntity> getAllUser();

	public List<TransactionEntity> viewTransactionDetail(long accountNumber)
			throws AccountException, ValidatorException;

}
