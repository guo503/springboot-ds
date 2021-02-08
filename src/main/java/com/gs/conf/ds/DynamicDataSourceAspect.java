package com.gs.conf.ds;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Objects;


/**
 * 自定义注解 + AOP的方式实现数据源动态切换。
 *
 * @author guos
 * @date 2021/1/27 15:40
 **/
@Aspect
@Component
@Slf4j
public class DynamicDataSourceAspect implements Ordered {


    /**
     * 设置数据源
     * @param proceedingJoinPoint
     * @param ds
     * @author guos
     * @date 2021/2/4 11:32
     * @return
     **/
    @Around("@annotation(ds)")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint, DS ds) throws Throwable {
        try {
            //默认主库
            String db = DSConst.DS_MASTER;
            if (Objects.nonNull(ds) && !StringUtils.isEmpty(ds.value())) {
                db = ds.value();
            }
            DataSourceContextHolder.setDB(db);
            return proceedingJoinPoint.proceed();
        } finally {
            DataSourceContextHolder.clearDB();
        }
    }


    @Override
    public int getOrder() {
        return 0;
    }
}
