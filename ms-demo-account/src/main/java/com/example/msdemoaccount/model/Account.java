package com.example.msdemoaccount.model;


import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String accountNumber;
    String currency;
    BigDecimal balance;
    Date createDate;


}
