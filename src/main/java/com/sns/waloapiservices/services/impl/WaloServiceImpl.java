package com.sns.waloapiservices.services.impl;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.sns.waloapiservices.dtos.BaseResponse;
import com.sns.waloapiservices.model.*;
import com.sns.waloapiservices.repository.*;
import com.sns.waloapiservices.services.WaloService;
import com.sns.waloapiservices.utils.TokenValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.security.PublicKey;

@Service
public class WaloServiceImpl implements WaloService {

    @Autowired
    private PostArticleRepository postArticleRepository;

    @Autowired
    private TokenValidator tokenValidator;

    @Override
    public BaseResponse<Object> postArticle(PostArticles postArticles, String token) {
        try {
            tokenValidator.validateByToken(token);
            PostArticles optionalPostArticles = postArticleRepository.save(postArticles);
            return BaseResponse.builder().statusCode(HttpStatus.OK.value()).data(optionalPostArticles).errorDesc(null).result("Posted article").build();
        }
        catch (Exception exception) {
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(null).errorDesc(exception.getLocalizedMessage()).result(exception.getMessage()).build();
        }
    }

    @Autowired
    private AccidentsRepository accidentsRepository;

    @Override
    public  BaseResponse<Object> postAccidents(Accidents accidents, String token) {
        try {
            tokenValidator.validateByToken(token);
            Accidents optionalAccidents = accidentsRepository.save(accidents);
            return BaseResponse.builder().statusCode(HttpStatus.OK.value()).data(optionalAccidents).errorDesc(null).result("Reported Accidents").build();
        }
        catch (Exception exception){
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(null).errorDesc(exception.getLocalizedMessage()).result(exception.getMessage()).build();
        }
    }

    @Autowired
    private AppliedJobsRepository appliedJobsRepository;

    @Override
    public BaseResponse<Object> postAppliedJobs(AppliedJobs appliedJobs, String token){
        try{
            tokenValidator.validateByToken(token);
            AppliedJobs optionalAppliedJobs =  appliedJobsRepository.save(appliedJobs);
            return BaseResponse.builder().statusCode(HttpStatus.OK.value()).data(optionalAppliedJobs).errorDesc(null).result("Apply for Jobs").build();
        }
        catch (Exception exception){
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(null).errorDesc(exception.getLocalizedMessage()).result(exception.getMessage()).build();
        }
    }

    @Autowired
    private BankDetailsRepository bankDetailsRepository;

    @Override
    public BaseResponse<Object> postBankDetails (BankDetails bankDetails,String token ){
        try{
            tokenValidator.validateByToken(token);
            BankDetails optionalBankDetails =  bankDetailsRepository.save(bankDetails);
            return BaseResponse.builder().statusCode(HttpStatus.OK.value()).data(optionalBankDetails).errorDesc(null).result("Bank Details").build();
        }
        catch (Exception exception){
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(null).errorDesc(exception.getLocalizedMessage()).result(exception.getMessage()).build();
        }
    }

    @Autowired
    private BloodBankRepository bloodBankRepository;

    @Override
    public BaseResponse<Object> postBloodBank (BloodBank bloodBank, String token){
        try{
            tokenValidator.validateByToken(token);
            BloodBank optionalBloodBank = bloodBankRepository.save(bloodBank);
            return BaseResponse.builder().statusCode(HttpStatus.OK.value()).data(optionalBloodBank).errorDesc(null).result("Bank Details").build();
        }
        catch (Exception exception){
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(null).errorDesc(exception.getLocalizedMessage()).result(exception.getMessage()).build();
        }
    }
    @Autowired
    private FundsRepository fundsRepository;

    @Override
    public BaseResponse<Object> postFunds (Funds funds, String token){
        try{
            tokenValidator.validateByToken(token);
            Funds optionalFunds = fundsRepository.save(funds);
            return BaseResponse.builder().statusCode(HttpStatus.OK.value()).data(optionalFunds).errorDesc(null).result("Bank Details").build();
        }
        catch (Exception exception){
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(null).errorDesc(exception.getLocalizedMessage()).result(exception.getMessage()).build();
        }
    }

    @Autowired
    private LegalDiscussionRepository legalDiscussionRepository;

    @Override
    public BaseResponse<Object> postLegalDiscussion (LegalDiscussion legalDiscussion, String token){
        try{
            tokenValidator.validateByToken(token);
            LegalDiscussion optionalLegalDiscussion = legalDiscussionRepository.save(legalDiscussion);
            return BaseResponse.builder().statusCode(HttpStatus.OK.value()).data(optionalLegalDiscussion).errorDesc(null).result("Legal Discussion").build();
        }
        catch (Exception exception){
            return BaseResponse.builder().statusCode(HttpStatus.FORBIDDEN.value()).data(null).errorDesc(exception.getLocalizedMessage()).result(exception.getMessage()).build();
        }
    }
}
