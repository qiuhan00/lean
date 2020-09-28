package com.cfang.sharding.mapper;

import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONUtil;
import com.cfang.sharding.entity.OaEmail;
import com.cfang.sharding.entity.OaMsgMonth;
import com.cfang.sharding.entity.OaSendMsg;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author cfang 2020/9/25 10:47
 * @description
 */
@SpringBootTest(classes = {TestApplicatiion.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class OaSendMsgMapperTest {

    @Autowired
    private OaSendMsgMapper oaSendMsgMapper;
    @Autowired
    private OaMsgMonthMapper oaMsgMonthMapper;
    @Autowired
    private OaEmailMapper oaEmailMapper;

    @Test
    public void save(){
        OaSendMsg msg = new OaSendMsg().setMsgBody(DateUtil.now())
                .setMsgDate("2020-1-26")
                .setMsgType("1");
        oaSendMsgMapper.insertSelective(msg);
    }

    @Test
    public void select(){
        OaSendMsg msg = new OaSendMsg()
                .setMsgDate("2020-1-00");
//        oaSendMsgMapper.select(msg);
//        oaSendMsgMapper.selectByTs("2019-1-1", "2020-1-31");
        System.out.println(JSONUtil.toJsonStr(oaSendMsgMapper.selectByTs("2019-1-1", "2019-1-15")));
    }

    @Test
    public void save2(){
        OaMsgMonth msg = new OaMsgMonth().setMsgBody(DateUtil.now())
                .setMsgDate("2020-2-26")
                .setMsgType("1");
        oaMsgMonthMapper.insertSelective(msg);
    }

    @Test
    public void save3(){
        OaEmail oaEmail = new OaEmail().setContent("test")
                .setReceiveEmail("test")
                .setSubject("test");
        oaEmailMapper.insertSelective(oaEmail);
    }
}