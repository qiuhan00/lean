package com.cfang.valid.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author cfang 2020/9/23 11:29
 * @description
 */
@Data
public class AddressInfoVo {

    @NotBlank(message = "street is not null")
    private String street;
}
