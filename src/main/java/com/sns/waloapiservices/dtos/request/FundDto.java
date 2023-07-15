package com.sns.waloapiservices.dtos.request;

import com.sns.waloapiservices.model.BankDetails;
import lombok.Data;

@Data
public class FundDto {
    private String amount;
    private BankDetails bankDetails;
}
