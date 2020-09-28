package com.cfang.sharding.algorithm;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @author cfang 2020/9/25 14:11
 * @description
 */
public class PreciseYearDatabaseShardingAlgorithm implements PreciseShardingAlgorithm<String> {

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
            String year = DateUtil.year(DateUtil.parse(columnVal)) + "";
            if (item.endsWith(year)){
                return item;
            }
        }
        return null;
    }

}
