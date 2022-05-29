package ma.mehdi.ebankingbackend.dtos;


import lombok.Data;
import ma.mehdi.ebankingbackend.enums.AccountStatus;

import java.util.Date;


@Data

public class SavingBankAccountDTO extends BankAccountDTO {
    private String id;
    private Date CreatedAt;
    private double balance;
    private AccountStatus status;
    private String currency;
    private CustomerDTO customerDTO;
    private double interestRate;

}
