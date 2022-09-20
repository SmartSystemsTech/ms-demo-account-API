package com.example.msdemoaccount.service;

import com.example.msdemoaccount.dto.AccountDTO;
import com.example.msdemoaccount.mapper.AccountMapper;
import com.example.msdemoaccount.model.Account;
import com.example.msdemoaccount.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    private final AccountMapper accountMapper;

    @Override
    public Optional<AccountDTO> getAccountById(Long id) {
        return Optional.of(accountMapper.accountTOAccountDTO(accountRepository.findAccountById(id)));
    }

    @Override
    public AccountDTO create(AccountDTO accountDTO) {
        return accountMapper.accountTOAccountDTO(accountRepository.save(accountMapper.accountDtoTOAccount(accountDTO)));
    }
}
