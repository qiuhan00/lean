package com.cfang.valid.controller;

import javax.validation.groups.Default;

/**
 * @author cfang 2020/9/23 10:47
 * @description
 *
 * 关于 extends Default
 * 继承 Default 的话，所有定义校验规则的都会校验
 * 不继承的话，则只校验加了group信息的校验字段
 */
public interface UserGroup extends Default{
}
