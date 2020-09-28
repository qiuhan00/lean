package com.cfang.sharding.mapper;

import com.cfang.sharding.entity.OaSendMsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * @author cfang 2020/9/25 10:45
 * @description
 */
@Mapper
public interface OaSendMsgMapper extends BaseMapper<OaSendMsg> {


    @Select("select * from oa_send_msg where msg_date between #{start} and #{end}")
    List<OaSendMsg> selectByTs(@Param("start") String start, @Param("end") String end);
}
