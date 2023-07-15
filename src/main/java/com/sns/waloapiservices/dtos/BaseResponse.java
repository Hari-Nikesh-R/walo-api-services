package com.sns.waloapiservices.dtos;

import lombok.Data;

@Data
public class BaseResponse<T>{
    private String result;
    private String errorDesc;
    private int statusCode;
    private T data;
}
