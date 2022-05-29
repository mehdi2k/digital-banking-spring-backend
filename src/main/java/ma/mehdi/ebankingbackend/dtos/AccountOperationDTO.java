package ma.mehdi.ebankingbackend.dtos;

import lombok.Data;
import ma.mehdi.ebankingbackend.enums.OperationType;

import java.util.Date;


@Data
public class AccountOperationDTO {
    private Long id;
    private Date date;
    private double amount;
    private OperationType type;
    private String description;
}
