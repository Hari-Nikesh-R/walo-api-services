package com.sns.waloapiservices.model;

import com.sns.waloapiservices.dtos.response.DiscussionDto;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("legal_discussion")
public class LegalDiscussion {
    private DiscussionDto discussion;
}
