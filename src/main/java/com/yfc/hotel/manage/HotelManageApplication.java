package com.yfc.hotel.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>description酒店管理启动类</p>
 *
 * @author yfc
 * @see
 * @since 1.0.0
 */
@SpringBootApplication
@MapperScan({"com.yfc.hotel.manage.dao"})
public class HotelManageApplication<SpringBootAppliction> {
    public static void main(String[] args) {
        SpringApplication.run(HotelManageApplication.class,args);
    }
}
