package com.cfang.sharding.algorithm;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @author cfang 2020/9/25 10:27
 * @description
 */
public class PreciseFiveDaysTableShardingAlgorithm implements PreciseShardingAlgorithm<String> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        //配置的分片的sharding-column对应的值
        String columnVal = preciseShardingValue.getValue();
        //分库时配置的sharding-column
        String columnName = preciseShardingValue.getColumnName();
        //需要分库的逻辑表
        String table = preciseShardingValue.getLogicTableName();
        if (StrUtil.isBlank(columnVal)) {
            throw new UnsupportedOperationException("preciseShardingValue is null");
        }
        for (String item : collection) {
            int month = DateUtil.month(DateUtil.parse(columnVal)) + 1; //月份
            int day = DateUtil.dayOfMonth(DateUtil.parse(columnVal)); //天
            String value = "_";
            if (0 < day && day <= 5) {//1-5号
                value += month + "_" + "1";
            }
            if (5 < day && day <= 10) {//6-10号
                value += month + "_" + "2";
            }
            if (10 < day && day <= 15) {//11-15号
                value += month + "_" + "3";
            }
            if (15 < day && day <= 20) {//16-20号
                value += month + "_" + "4";
            }
            if (20 < day && day <= 25) {//21-25号
                value += month + "_" + "5";
            }
            if (25 < day && day <= 31) {//26-31号
                value += month + "_" + "6";
            }
            if(item.endsWith(value)){
                return item;
            }
        }
        return null;
    }

}
