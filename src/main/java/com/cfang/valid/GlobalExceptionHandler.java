package com.cfang.valid;

import com.cfang.unite.ResponseResultBody;
import com.cfang.valid.dto.ResponseData;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cfang 2020/9/22 18:17
 * @description
 *
 */
@RestControllerAdvice
public class GlobalExceptionHandler implements ResponseBodyAdvice<Object> {
    private static final Integer BAD_REQUEST_CODE = 900;
    private static final String BAD_REQUEST_MSG = "req param invalid";

    @ExceptionHandler(BindException.class)
    public ResponseData bindExceptionHandler(BindException exception){
        List<String> collect = exception.getAllErrors().stream().map(item -> item.getDefaultMessage())
                .collect(Collectors.toList());
        return ResponseData.fail(BAD_REQUEST_CODE, BAD_REQUEST_MSG, collect);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseData argInvalidExceptionHandler(MethodArgumentNotValidException exception){
        List<String> collect = exception.getBindingResult().getFieldErrors().stream().map(item -> item.getDefaultMessage())
                .collect(Collectors.toList());
        return ResponseData.fail(BAD_REQUEST_CODE, BAD_REQUEST_MSG, collect);
    }

    @ExceptionHandler(Exception.class)
    public ResponseData exceptionHandler(Exception exception){
        exception.printStackTrace();
        return ResponseData.fail(500, exception.getMessage());
    }

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return AnnotatedElementUtils.hasAnnotation(returnType.getContainingClass(), ANNOTATION_TYPE) || returnType.hasMethodAnnotation(ANNOTATION_TYPE);
    }

    @SneakyThrows
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
//        if(body instanceof String){
//            ObjectMapper objectMapper = new ObjectMapper();
//            return objectMapper.writeValueAsString(ResponseData.success(body));
//        }
        if(body instanceof ResponseResultBody){
            return body;
        }
        return ResponseData.success(body);
    }

    private static final Class<? extends Annotation> ANNOTATION_TYPE = ResponseResultBody.class;
}
