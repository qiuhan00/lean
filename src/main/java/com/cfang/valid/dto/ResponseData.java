package com.cfang.valid.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author cfang 2020/9/22 17:51
 * @description
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class ResponseData<T> {

    @NonNull
    private Integer code;
    @NonNull
    private String message;
    private T data;

    public static ResponseData success() {
        return new ResponseData(HttpStatus.OK.value(), "SUCCESS");
    }

    public static ResponseData success(Object data) {
        ResponseData entity = success();
        entity.setData(data);
        return entity;
    }

    public static ResponseData fail(Integer code, String msg) {
        return new ResponseData(code, msg);
    }

    public static ResponseData fail(Integer code, String msg, Object data) {
        ResponseData entity = fail(code, msg);
        entity.setData(data);
        return entity;
    }
}
