package com.example.msdemoaccount.service;

import com.example.msdemoaccount.dto.AccountDTO;
import com.example.msdemoaccount.model.Account;

import java.util.Optional;

public interface AccountService {

    Optional<AccountDTO> getAccountById(Long id);

    AccountDTO create(AccountDTO account);
}
