package com.cfang.valid.controller;

import com.cfang.unite.ResponseResultBody;
import com.cfang.valid.dto.ResponseData;
import com.cfang.valid.vo.UserInfoVo;
import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

/**
 * @author cfang 2020/9/27 11:28
 * @description
 */
@RestController
@RequestMapping("order")
@ResponseResultBody
public class OrderController{

    @PostMapping("saveOrder")
    public String save(){
        return "save order success";
    }

    @PostMapping("saveOrder2")
    public Map<String, String> save2(){
        Map<String, String> map = Maps.newHashMap();
        map.put("result", "save order success");
        return map;
    }
}
