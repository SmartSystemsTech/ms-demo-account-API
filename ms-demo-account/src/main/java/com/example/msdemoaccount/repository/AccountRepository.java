package com.example.msdemoaccount.repository;

import com.example.msdemoaccount.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findAccountById(Long id);

}
