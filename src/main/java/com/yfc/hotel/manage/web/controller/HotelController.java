package com.yfc.hotel.manage.web.controller;

import com.yfc.hotel.manage.global.ResultBean;
import com.yfc.hotel.manage.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * <p>description 酒店管理</p>
 *
 * @author yfc
 * @see
 * @since 1.0.0
 */
@RestController
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @GetMapping("/hotel/guest/month/nights")
    public ResultBean getsGustmPerMonthNigthts(){
        return ResultBean.success(hotelService.gets());
    }
}
