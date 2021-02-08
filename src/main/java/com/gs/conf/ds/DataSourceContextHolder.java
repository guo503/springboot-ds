package com.gs.conf.ds;


import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

/**
 * 设置数据源
 *
 * @author guos
 * @date 2021/1/27 15:37
 **/
@Slf4j
public class DataSourceContextHolder {


    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    // 设置数据源名
    public static void setDB(String dbType) {
        log.info("change to {} datasource", dbType);
        contextHolder.set(dbType);
    }

    // 获取数据源名
    public static String getDB() {
        return StringUtils.isEmpty(contextHolder.get()) ? DSConst.DS_MASTER : contextHolder.get();
    }

    // 清除数据源名
    public static void clearDB() {
        contextHolder.remove();
    }
}
