package com.sns.waloapiservices.dtos.request;

import com.sns.waloapiservices.dtos.Roles;
import lombok.Data;

import java.util.List;

@Data
public class CompanyDto {
    private String name;
    private String companyBusiness;
    private List<Roles> rolesOffered;
    private String openPosition;
    private Integer requiredExperience;
    private Integer salaryOffered;
}

