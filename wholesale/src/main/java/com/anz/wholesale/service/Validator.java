package com.anz.wholesale.service;

public class Validator {
	public static boolean validateAccountNumber(Long accountNumber) {
		String regex = "[0-9]{9}";
		if (accountNumber.toString().matches(regex)) {
			return true;
		} else {
			return false;
		}
	}

}
