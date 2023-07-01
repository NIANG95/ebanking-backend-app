package org.msn.ebankingbackend.dtos;

import lombok.Data;
import org.msn.ebankingbackend.enums.OperatonType;
import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperatonType type;
    private String description;
}
