package com.anz.wholesale.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
	private static Logger logger = LogManager.getLogger(ExceptionControllerAdvice.class);

	public ResponseEntity<ErrorMessage> accountExceptionHandler(AccountException ex) {
		logger.error(ex.getMessage());
		ErrorMessage error = new ErrorMessage();
		error.setErrorCode(500);
		error.setErrorMessage(ex.getMessage());
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(ValidatorException.class)
	public ResponseEntity<ErrorMessage> validatorExceptionHandler(ValidatorException ex) {
		logger.error(ex.getMessage());
		ErrorMessage error = new ErrorMessage();
		error.setErrorCode(500);
		error.setErrorMessage(ex.getMessage());
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
