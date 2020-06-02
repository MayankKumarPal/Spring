package com.anz.wholesale.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.anz.wholesale.entity.TransactionEntity;

import com.anz.wholesale.exception.AccountException;
import com.anz.wholesale.exception.ValidatorException;
import com.anz.wholesale.repository.TransactionRepository;
import com.anz.wholesale.repository.UserAccountRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionServiceTest {

	@InjectMocks
	private TransactionServiceImpl transactionServiceImpl;

	@Mock
	private TransactionRepository transactionRepository;

	@Mock
	private UserAccountRepository userAccountRepository;

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	private List<TransactionEntity> transaction = null;

	@Before
	public void initialize() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getAllTransactionTest() throws AccountException {
		TransactionEntity transactionEntity = new TransactionEntity();
		transactionEntity.setAccountName("SGSavings729");
		transactionEntity.setAccountNumber(136056165);
		transactionEntity.setCreditAmount(9442.50);
		transactionEntity.setCurrency("SGD");
		transactionEntity.setDebitAmount(0);
		transactionEntity.setTransactionNarrative(" ");
		transactionEntity.setType("Credit");
		transactionEntity.setValueDate(LocalDate.of(2018, 12, 8));
		transaction.add(transactionEntity);
		when(transactionRepository.findByAccountNumber(136056165L)).thenReturn(transaction);
		List<TransactionEntity> transactionList = transactionRepository.findByAccountNumber(136056165L);
		assertEquals(1, transactionList.size());
		for (TransactionEntity transactionEntity2 : transactionList) {
			assertEquals(136056165, transactionEntity2.getAccountNumber());
		}
	}

	@Test
	public void getAllTransactionNegativeTest() throws AccountException, ValidatorException {
		List<TransactionEntity> transactionList = new ArrayList<TransactionEntity>();
		expectedException.expect(AccountException.class);
		expectedException.expectMessage("Account Number Invalid");
		Mockito.when(transactionRepository.findByAccountNumber(Mockito.anyInt())).thenReturn(transactionList);
		transactionServiceImpl.viewTransactionDetail(1);
	}

}
