package com.sns.waloapiservices.model;


import com.sns.waloapiservices.dtos.Roles;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("apply_job")
@Data
public class AppliedJobs {
    @Id
    private String id;
    private Integer experience;
    private Roles roles;
    private String preferredLocation;
    private Integer ctc;
    private String position;
}
