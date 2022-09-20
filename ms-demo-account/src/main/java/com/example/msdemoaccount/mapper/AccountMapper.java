package com.example.msdemoaccount.mapper;


import com.example.msdemoaccount.dto.AccountDTO;
import com.example.msdemoaccount.model.Account;
import org.mapstruct.Mapper;



@Mapper(componentModel = "spring")
public interface AccountMapper {

    Account accountDtoTOAccount(AccountDTO accountDTO);
    AccountDTO accountTOAccountDTO(Account accountDTO);
}
