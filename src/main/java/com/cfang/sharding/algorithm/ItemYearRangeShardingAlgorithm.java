package com.cfang.sharding.algorithm;

import cn.hutool.core.date.DateUtil;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.util.Collection;
import java.util.Date;

/**
 * @author cfang 2020/9/25 15:45
 * @description 用于处理BETWEEN AND分片，找出这个范围的数据分布在那些库中
 */
@Slf4j
public class ItemYearRangeShardingAlgorithm implements RangeShardingAlgorithm<String> {

    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<String> rangeShardingValue) {
        Collection<String> collect = Lists.newArrayList();
        Range<String> valueRange = rangeShardingValue.getValueRange();

        Date start = DateUtil.parse(valueRange.lowerEndpoint());
        Date end = DateUtil.parse(valueRange.upperEndpoint());
        int endYear = DateUtil.year(end);
        int startYear = DateUtil.year(start);
        while(startYear <= endYear){
            String val = startYear + "";
            collect.add(collection.stream().filter(item -> item.endsWith(val)).findFirst().get());
            startYear++;
        }
        return collect;
    }

}
