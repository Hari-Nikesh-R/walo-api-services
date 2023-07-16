package com.sns.waloapiservices.services;

import com.sns.waloapiservices.dtos.BaseResponse;
import com.sns.waloapiservices.model.*;

public interface WaloService {
    BaseResponse<Object> postArticle(PostArticles postArticles);
    BaseResponse<Object> postAccidents(Accidents accidents);

    BaseResponse<Object> postAppliedJobs(AppliedJobs appliedJobs);

    BaseResponse<Object> postBankDetails(BankDetails bankDetails);

    BaseResponse<Object> postBloodBank(BloodBank bloodBank);

    BaseResponse<Object> postFunds(Funds funds);

    BaseResponse<Object> postLegalDiscussion(LegalDiscussion legalDiscussion);

}
