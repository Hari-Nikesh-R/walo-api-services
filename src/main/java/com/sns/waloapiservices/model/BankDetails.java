package com.sns.waloapiservices.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("bank_detail")
public class BankDetails {
    @Id
    private String bankAccount;
    private String ifscCode;
    private String bankName;
}
