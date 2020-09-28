package com.cfang.sharding.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author cfang 2020/9/25 10:41
 * @description
 */
@Data
@Accessors(chain = true)
public class OaSendMsgErr {
    private Long id;
    private String msgType;
    private String msgBody;
    private String msgDate;
}
