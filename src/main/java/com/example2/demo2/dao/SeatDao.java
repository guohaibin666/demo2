package com.example2.demo2.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface SeatDao {

    //预约
    void updateSeatStatus(Map<String,Object> params);

}
