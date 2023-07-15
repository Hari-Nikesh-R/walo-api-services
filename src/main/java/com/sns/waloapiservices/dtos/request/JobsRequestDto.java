package com.sns.waloapiservices.dtos.request;

import com.sns.waloapiservices.dtos.Roles;
import lombok.Data;

@Data
public class JobsRequestDto {
    private Integer experience;
    private Roles roles;
    private String preferredLocation;
    private Integer ctc;
    private String position;
}
