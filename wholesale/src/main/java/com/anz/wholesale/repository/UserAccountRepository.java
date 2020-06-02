package com.anz.wholesale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anz.wholesale.entity.UserAccountEntity;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccountEntity, Long> {

}
