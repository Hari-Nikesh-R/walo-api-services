package com.sns.waloapiservices.dtos.response;

import lombok.Data;

@Data
public class DiscussionDto {
    private String query;
    private String imageUrl;
    private Integer userId;
    private String legalAdvisorContactDetails;
}
