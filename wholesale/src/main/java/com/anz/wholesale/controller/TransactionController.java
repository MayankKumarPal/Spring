package com.anz.wholesale.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.wholesale.entity.UserAccountEntity;
import com.anz.wholesale.exception.AccountException;
import com.anz.wholesale.exception.ValidatorException;
import com.anz.wholesale.service.TransactionService;


@RestController
@RequestMapping("/user")
public class TransactionController {
	private static final Logger logger = LogManager.getLogger(TransactionService.class);
	@Autowired
	private TransactionService transactionService;

	@GetMapping("/fetch")
	public List<UserAccountEntity> getAllUser() {
		return transactionService.getAllUser();
	}

	@GetMapping("/transaction/{accountNumber}")
	public ResponseEntity<Object> viewTransactionDetail(@PathVariable("accountNumber") long accountNumber)
			throws AccountException, ValidatorException {
		logger.info(accountNumber);
		return new ResponseEntity<>(transactionService.viewTransactionDetail(accountNumber), HttpStatus.OK);
	}

}
