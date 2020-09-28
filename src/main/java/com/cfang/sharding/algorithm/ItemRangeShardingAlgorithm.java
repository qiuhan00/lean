package com.cfang.sharding.algorithm;

import cn.hutool.core.date.DateUtil;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Date;

/**
 * @author cfang 2020/9/25 15:45
 * @description 用于处理BETWEEN AND分片，找出这个范围的数据分布在那些表中
 */
@Slf4j
public class ItemRangeShardingAlgorithm implements RangeShardingAlgorithm<String> {

    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<String> rangeShardingValue) {
        Collection<String> collect = Lists.newArrayList();
        String loginTable = rangeShardingValue.getLogicTableName();
        Range<String> valueRange = rangeShardingValue.getValueRange();

        Date start = DateUtil.parse(valueRange.lowerEndpoint());
        Date end = DateUtil.parse(valueRange.upperEndpoint());
        while(start.before(end)){
            int month = DateUtil.month(start) + 1;
            for(int i = 1; i < 7; i++){
                collect.add(String.join("_", loginTable, month + "", i + ""));
            }
            start = DateUtil.offsetMonth(start, 1);
        }

        return collect;
    }

}
