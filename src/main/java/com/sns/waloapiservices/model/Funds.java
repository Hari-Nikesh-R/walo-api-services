package com.sns.waloapiservices.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("funds")
public class Funds {
    private String amount;
    private BankDetails bankDetails;
}
