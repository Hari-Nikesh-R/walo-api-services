package com.sns.waloapiservices.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;


public class TokenValidator {
    @Autowired
    RestTemplate restTemplate;

    private final String AUTHENTICATION_URL = "http://localhost:8089";
    private final String GET_EMAIL = "/user/get-email";
    private TokenValidator(){}
    private static TokenValidator instance;
    public static TokenValidator getInstance()
    {
        if(instance==null)
        {
            instance = new TokenValidator();
        }
        return instance;
    }

    public String validateByToken(String token)
    {
        HttpEntity<String> entity = setTokenInHeaders(token);
        return restTemplate.exchange(AUTHENTICATION_URL + GET_EMAIL, HttpMethod.GET,entity,String.class).getBody();
    }

    private HttpEntity<String> setTokenInHeaders(String token){
        HttpHeaders httpHeaders = getHeaders();
        httpHeaders.set(AUTHORIZATION,token);
        return new HttpEntity<>(httpHeaders);
    }
    private HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        return headers;
    }
}
