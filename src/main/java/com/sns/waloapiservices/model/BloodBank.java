package com.sns.waloapiservices.model;

import com.sns.waloapiservices.dtos.Location;
import com.sns.waloapiservices.dtos.request.UserDetailsDto;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("blood_bank_details")
public class BloodBank {
    @Id
    private String id;
    private UserDetailsDto adminDetails;
    private Location hospitalLocation;
}
