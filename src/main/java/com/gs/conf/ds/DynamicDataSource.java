package com.gs.conf.ds;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


/**
 * 数据源路由
 *
 * @author guos
 * @date 2021/1/27 15:39
 **/
@Slf4j
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        log.info("datasource->{}", DataSourceContextHolder.getDB());
        return DataSourceContextHolder.getDB();
    }
}
