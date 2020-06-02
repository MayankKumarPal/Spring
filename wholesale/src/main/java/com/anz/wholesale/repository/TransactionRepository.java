package com.anz.wholesale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anz.wholesale.entity.TransactionEntity;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Integer> {
	public List<TransactionEntity> findByAccountNumber(long accountNumber);

}
