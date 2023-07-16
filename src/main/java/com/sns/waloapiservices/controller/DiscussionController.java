package com.sns.waloapiservices.controller;

import com.sns.waloapiservices.dtos.BaseResponse;
import com.sns.waloapiservices.model.*;
import com.sns.waloapiservices.services.WaloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PrivateKey;

@RestController
@RequestMapping(value = "/discussion")
public class DiscussionController {

    @Autowired
    private WaloService waloService;

    @PostMapping(value = "/post-article")
    public BaseResponse<Object> postArticle(@RequestBody PostArticles postArticles) {
        return waloService.postArticle(postArticles);
    }

    @PostMapping(value ="/accident")
    public BaseResponse<Object> postAccident(@RequestBody Accidents accidents){
        return waloService.postAccidents(accidents);
    }

    @PostMapping(value = "/applied-jobs")
    public BaseResponse<Object> postAppliedJobs(@RequestBody AppliedJobs appliedJobs){
        return waloService.postAppliedJobs(appliedJobs);
    }

    @PostMapping(value = "/bank-details")
    public BaseResponse<Object> postBankDetails(@RequestBody BankDetails bankDetails){
        return waloService.postBankDetails(bankDetails);
    }

    @PostMapping(value ="/blood-bank")
    public BaseResponse<Object> postBloodBank(@RequestBody BloodBank bloodBank){
        return waloService.postBloodBank(bloodBank);
    }

    @PostMapping(value= "/funds")
    public BaseResponse<Object> postFunds(@RequestBody Funds funds){
        return waloService.postFunds(funds);
    }

    @PostMapping(value = "/legal-discussion")
    public BaseResponse<Object> postLegalDiscussion(@RequestBody LegalDiscussion legalDiscussion){
        return waloService.postLegalDiscussion(legalDiscussion);
    }

}
