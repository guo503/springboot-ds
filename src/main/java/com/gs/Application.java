package com.gs;

import mybatis.spring.annotation.ExtMapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author guos
 * @date 2021/2/2 15:09
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ExtMapperScan(basePackages = "com.gs.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
