package com.example2.demo2.controller;

import com.example2.demo2.service.ISeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SeatController {

    @Autowired
    private ISeatService seatService;


    @RequestMapping("/user/subscribe")
    @ResponseBody
    public String subscribe(){

        seatService.updateSeatStatus("A1",2);
        return null;
    }


}
