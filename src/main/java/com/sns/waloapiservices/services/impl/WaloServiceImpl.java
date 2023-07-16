package com.sns.waloapiservices.services.impl;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.sns.waloapiservices.dtos.BaseResponse;
import com.sns.waloapiservices.model.Accidents;
import com.sns.waloapiservices.model.AppliedJobs;
import com.sns.waloapiservices.model.BankDetails;
import com.sns.waloapiservices.model.PostArticles;
import com.sns.waloapiservices.repository.AccidentsRepository;
import com.sns.waloapiservices.repository.AppliedJobsRepository;
import com.sns.waloapiservices.repository.BankDetailsRepository;
import com.sns.waloapiservices.repository.PostArticleRepository;
import com.sns.waloapiservices.services.WaloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

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

    @Autowired
    private AccidentsRepository accidentsRepository;

    @Override
    public  BaseResponse<Object> postAccidents(Accidents accidents) {
        try {
            Accidents optionalAccidents = accidentsRepository.save(accidents);
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(optionalAccidents).errorDesc(null).result("Reported Accidents").build();
        }
        catch (Exception exception){
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(null).errorDesc(exception.getLocalizedMessage()).result(exception.getMessage()).build();
        }
    }

    @Autowired
    private AppliedJobsRepository appliedJobsRepository;

    @Override
    public BaseResponse<Object> postAppliedJobs(AppliedJobs appliedJobs){
        try{
            AppliedJobs optionalAppliedJobs =  appliedJobsRepository.save(appliedJobs);
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(optionalAppliedJobs).errorDesc(null).result("Apply for Jobs").build();
        }
        catch (Exception exception){
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(null).errorDesc(exception.getLocalizedMessage()).result(exception.getMessage()).build();
        }
    }

    @Autowired
    private BankDetailsRepository bankDetailsRepository;

    @Override
    public BaseResponse<Object> postBankDetails (BankDetails bankDetails){
        try{
            BankDetails optionalBankDetails =  bankDetailsRepository.save(bankDetails);
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(optionalBankDetails).errorDesc(null).result("Bank Details").build();
        }
        catch (Exception exception){
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(null).errorDesc(exception.getLocalizedMessage()).result(exception.getMessage()).build();
        }
    }
}
