package com.anz.wholesale.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class UserAccountEntity {
	@Id
	@Column
	private long accountNumber;
	@Column
	private String accountName;
	@Column
	private String accountType;
	@Column
	private LocalDate balanceDate;
	@Column
	private String currencytype;
	@Column
	private double openingAvailableBalance;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public LocalDate getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(LocalDate balanceDate) {
		this.balanceDate = balanceDate;
	}
	public String getCurrencytype() {
		return currencytype;
	}
	public void setCurrencytype(String currencytype) {
		this.currencytype = currencytype;
	}
	public double getOpeningAvailableBalance() {
		return openingAvailableBalance;
	}
	public void setOpeningAvailableBalance(double openingAvailableBalance) {
		this.openingAvailableBalance = openingAvailableBalance;
	}
	public UserAccountEntity(long accountNumber, String accountName, String accountType, LocalDate balanceDate,
			String currencytype, double openingAvailableBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balanceDate = balanceDate;
		this.currencytype = currencytype;
		this.openingAvailableBalance = openingAvailableBalance;
	}
	public UserAccountEntity() {
		super();
	}
	

}
