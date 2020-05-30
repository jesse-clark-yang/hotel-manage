package com.yfc.hotel.manage.service;

import com.yfc.hotel.manage.dao.HotelMapper;
import com.yfc.hotel.manage.dto.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>description酒店服务实现</p>
 *
 * @author yfc
 * @see
 * @since 1.0.0
 */
@Service
public class ImplHotelService implements HotelService{
    @Autowired
    private HotelMapper hotelMapper;

    @Override
    public List<Result> gets(){
        return  hotelMapper.selectBy();
    }
}
