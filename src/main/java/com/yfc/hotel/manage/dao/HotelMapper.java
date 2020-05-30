package com.yfc.hotel.manage.dao;

import com.yfc.hotel.manage.dto.Result;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface HotelMapper {
    List<Result> selectBy();
}
