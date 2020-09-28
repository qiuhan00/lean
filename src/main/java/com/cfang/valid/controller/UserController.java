package com.cfang.valid.controller;

import cn.hutool.core.date.DateUtil;
import com.cfang.valid.dto.ResponseData;
import com.cfang.valid.vo.UserInfoVo;
import org.hibernate.validator.internal.engine.groups.Group;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cfang 2020/9/22 15:24
 * @description
 */
@RestController
@RequestMapping("user")
public class UserController {

    @PostMapping("saveUser")
    public ResponseData saveUser(@Validated({UserGroup.class}) @RequestBody UserInfoVo userInfoVo, String token){
        return ResponseData.success(userInfoVo);
    }

    @PostMapping("updateUser")
    public ResponseData updateUser(@Valid @RequestBody UserInfoVo userInfoVo){
        return ResponseData.success(userInfoVo);
    }

    @InitBinder
    public void init(HttpServletRequest request, DataBinder dataBinder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }


}
