package com.cfang.unite;

import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.*;

/**
 * @author cfang 2020/9/27 10:59
 * @description
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE, ElementType.FIELD})
@Documented
@ResponseBody
public @interface ResponseResultBody {
}
