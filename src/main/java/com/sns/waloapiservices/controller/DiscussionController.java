package com.sns.waloapiservices.controller;

import com.sns.waloapiservices.dtos.BaseResponse;
import com.sns.waloapiservices.model.PostArticles;
import com.sns.waloapiservices.services.WaloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/discussion")
public class DiscussionController {

    @Autowired
    private WaloService waloService;

    @PostMapping(value = "/post-article")
    public BaseResponse<Object> postArticle(@ResponseBody PostArticles postArticles) {
        return waloService.postArticle(postArticles);
    }
}
