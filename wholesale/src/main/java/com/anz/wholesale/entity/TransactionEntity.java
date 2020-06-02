package com.anz.wholesale.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransactionEntity {
	@Id
	@Column
	private int id;
	@Column
	private long accountNumber;
	@Column
	private String accountName;
	@Column
	private LocalDate valueDate;
	@Column
	private String currency;
	@Column
	private double debitAmount;
	@Column
	private double creditAmount;
	@Column
	private String type;
	@Column
	private String transactionNarrative;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public LocalDate getValueDate() {
		return valueDate;
	}

	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}

	public double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTransactionNarrative() {
		return transactionNarrative;
	}

	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}

	public TransactionEntity(int id, long accountNumber, String accountName, LocalDate valueDate, String currency,
			double debitAmount, double creditAmount, String type, String transactionNarrative) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.valueDate = valueDate;
		this.currency = currency;
		this.debitAmount = debitAmount;
		this.creditAmount = creditAmount;
		this.type = type;
		this.transactionNarrative = transactionNarrative;
	}

	public TransactionEntity() {
		super();
	}

}
