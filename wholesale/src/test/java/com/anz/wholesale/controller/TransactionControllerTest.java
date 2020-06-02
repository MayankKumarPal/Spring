package com.anz.wholesale.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.anz.wholesale.service.TransactionService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = TransactionController.class)
public class TransactionControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TransactionService transactionService;

	@Test
	public void fetchAccountTest() throws Exception {
		mockMvc.perform(get("/user/fetch")).andExpect(status().isOk());
	}

	@Test
	public void fetchTransactiontest() throws Exception {
		mockMvc.perform(get("/user/transaction/accountNumber")).andExpect(status().isBadRequest());
	}

}
