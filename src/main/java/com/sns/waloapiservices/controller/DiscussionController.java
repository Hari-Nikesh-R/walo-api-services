package com.sns.waloapiservices.controller;

import com.sns.waloapiservices.dtos.BaseResponse;
import com.sns.waloapiservices.model.*;
import com.sns.waloapiservices.services.WaloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@RestController
@RequestMapping(value = "/discussion")
public class DiscussionController {

    @Autowired
    private WaloService waloService;

    @PostMapping(value = "/post-article")
    public BaseResponse<Object> postArticle(@RequestBody PostArticles postArticles, @RequestHeader(AUTHORIZATION) String token) {
        return waloService.postArticle(postArticles, token.substring(7));
    }

    @PostMapping(value = "/legal-discussion")
    public BaseResponse<Object> postLegalDiscussion(@RequestBody LegalDiscussion legalDiscussion,  @RequestHeader(AUTHORIZATION) String token){
        return waloService.postLegalDiscussion(legalDiscussion, token.substring(7));
    }

}
