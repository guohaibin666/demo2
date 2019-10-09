package com.example2.demo2.service.impl;

import com.example2.demo2.bean.Seat;
import com.example2.demo2.dao.SeatDao;
import com.example2.demo2.service.ISeatService;
import com.example2.demo2.utils.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class SeatServiceImpl implements ISeatService {

    @Autowired
    private SeatDao seatDao;

    @Override
    public ServiceResult updateSeatStatus(String seatId,int status){
        Map<String,Object> params = new HashMap<>();
        params.put("seatId", seatId);
        params.put("status", status);
        seatDao.updateSeatStatus(params);

        return new ServiceResult();
    }


}
