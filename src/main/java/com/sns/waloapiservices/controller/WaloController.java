package com.sns.waloapiservices.controller;

import com.sns.waloapiservices.dtos.BaseResponse;
import com.sns.waloapiservices.model.*;
import com.sns.waloapiservices.services.WaloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@RestController
@RequestMapping(value = "/walo")
public class WaloController {

    @Autowired
    WaloService waloService;
    @PostMapping(value ="/accident")
    public BaseResponse<Object> postAccident(@RequestBody Accidents accident, @RequestHeader(AUTHORIZATION) String token){
        return waloService.postAccidents(accident, token.substring(7));
    }

    @PostMapping(value = "/applied-jobs")
    public BaseResponse<Object> postAppliedJobs(@RequestBody AppliedJobs appliedJobs, @RequestHeader(AUTHORIZATION) String token){
        return waloService.postAppliedJobs(appliedJobs, token);
    }

    @GetMapping(value = "/jobs")
    public BaseResponse<Object> getAppliedJobs( @RequestHeader(AUTHORIZATION) String token) {
        return waloService.getAppliedJobs(token);
    }

    @PostMapping(value = "/bank-details")
    public BaseResponse<Object> postBankDetails(@RequestBody BankDetails bankDetails, @RequestHeader(AUTHORIZATION) String token){
        return waloService.postBankDetails(bankDetails,token);
    }

    @PostMapping(value ="/blood-bank")
    public BaseResponse<Object> postBloodBank(@RequestBody BloodBank bloodBank, @RequestHeader(AUTHORIZATION) String token){
        return waloService.postBloodBank(bloodBank, token);
    }

    @PostMapping(value= "/funds")
    public BaseResponse<Object> postFunds(@RequestBody Funds funds, @RequestHeader(AUTHORIZATION) String token){
        return waloService.postFunds(funds,token);
    }
}
