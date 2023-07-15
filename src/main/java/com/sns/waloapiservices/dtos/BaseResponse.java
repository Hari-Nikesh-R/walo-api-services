package com.sns.waloapiservices.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseResponse<T>{
    private String result;
    private String errorDesc;
    private int statusCode;
    private T data;
}
