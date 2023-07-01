package org.msn.ebankingbackend.dtos;

import lombok.Data;

import java.util.List;

@Data
public class AccountHistoryDTO {
    private String accountId;
    private double balance;
    private List<AccountOperationDTO> accountOperationDTOS;
    //pagination
    private int currentPage;
    private int totalPages;
    private int pageSize;
}
