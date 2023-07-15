package com.sns.waloapiservices.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("article")
public class PostArticles {
    @Id
    private String id;
    private String article;
    private Integer userId;
}
