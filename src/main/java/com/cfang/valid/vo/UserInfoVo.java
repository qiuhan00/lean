package com.cfang.valid.vo;

import com.cfang.valid.controller.UserGroup;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;


/**
 * @author cfang 2020/9/22 15:22
 * @description
 */
@Data
public class UserInfoVo {

    @NotBlank(message = "userName is not null", groups = UserGroup.class)
    private String userName;
    @NotNull(message = "age is not null")
    private Integer age;
    @NotBlank(message = "pwd is not null")
    private String pwd;
    @Past(message = "predate is invalid")
    @NotNull(message = "predate is not null")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date preDate;
    @Valid
    private AddressInfoVo infoVo;
}
