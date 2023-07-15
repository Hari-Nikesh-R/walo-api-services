package com.sns.waloapiservices.dtos.request;

import com.sns.waloapiservices.dtos.Gender;
import lombok.Data;

import java.util.Date;

@Data
public class UserDetailsDto {
    private String email;
    private String firstName;
    private String lastName;
    private Integer dob;
    private Gender gender;
    private Integer academicYear;
    private String phoneNumber;
    private String password;
    private String bloodGroup;
    private String organizationalAddress;
    private boolean authority;
    private Date createdAt;
}
