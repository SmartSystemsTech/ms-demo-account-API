package com.example.msdemoaccount.controller;


import com.example.msdemoaccount.dto.AccountDTO;
import com.example.msdemoaccount.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping(value = "/accounts")
@RequiredArgsConstructor
public class AccountController {


    private final AccountService accountService;


    @GetMapping(value = "/id/{id}")
    public Optional<AccountDTO> getAccountById(@PathVariable long id) {
        return accountService.getAccountById(id);
    }

    @PostMapping(value = "/create")
    public AccountDTO create(@RequestBody AccountDTO accountDTO) {
        return accountService.create(accountDTO);
    }
}
