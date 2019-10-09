package com.example2.demo2.service;

import com.example2.demo2.utils.ServiceResult;

public interface  ISeatService {

    //预约座位,修改座位状态
    ServiceResult updateSeatStatus(String seatId,int status);



}
