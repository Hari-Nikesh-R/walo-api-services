package com.sns.waloapiservices.services.impl;

import com.sns.waloapiservices.dtos.BaseResponse;
import com.sns.waloapiservices.model.PostArticles;
import com.sns.waloapiservices.repository.PostArticleRepository;
import com.sns.waloapiservices.services.WaloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WaloServiceImpl implements WaloService {

    @Autowired
    private PostArticleRepository postArticleRepository;

    @Override
    public BaseResponse<Object> postArticle(PostArticles postArticles) {
        try {
            PostArticles optionalPostArticles = postArticleRepository.save(postArticles);
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(optionalPostArticles).errorDesc(null).result("Posted article").build();
        }
        catch (Exception exception) {
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(null).errorDesc(exception.getLocalizedMessage()).result(exception.getMessage()).build();
        }
    }
}
