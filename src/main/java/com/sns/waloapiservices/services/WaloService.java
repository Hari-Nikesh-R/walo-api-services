package com.sns.waloapiservices.services;

import com.sns.waloapiservices.dtos.BaseResponse;
import com.sns.waloapiservices.model.PostArticles;

public interface WaloService {
    BaseResponse<Object> postArticle(PostArticles postArticles);
}
