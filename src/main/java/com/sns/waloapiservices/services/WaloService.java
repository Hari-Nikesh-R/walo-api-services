package com.sns.waloapiservices.services;

import com.sns.waloapiservices.dtos.BaseResponse;
import com.sns.waloapiservices.model.*;

public interface WaloService {
    BaseResponse<Object> postArticle(PostArticles postArticles, String token);
    BaseResponse<Object> postAccidents(Accidents accidents, String token);

    BaseResponse<Object> postAppliedJobs(AppliedJobs appliedJobs, String token);

    BaseResponse<Object> getAppliedJobs(String token);

    BaseResponse<Object> postBankDetails(BankDetails bankDetails, String token);

    BaseResponse<Object> postBloodBank(BloodBank bloodBank, String token);

    BaseResponse<Object> postFunds(Funds funds, String token);

    BaseResponse<Object> postLegalDiscussion(LegalDiscussion legalDiscussion, String token);

}
