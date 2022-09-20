package com.example.msdemoaccount.dto;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class AccountDTO {

    String accountNumber;
    String currency;
    BigDecimal balance;
    Date createDate;
}
