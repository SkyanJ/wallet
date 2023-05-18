package com.example.controller;

import com.example.model.Bill;
import com.example.service.BillService;
import com.example.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bill")
public class BillController {

    @Autowired
    private BillService billService;

    /**
     * 查询用户钱包金额变动明细的接口
     * @param userid
     * @return
     */
    @GetMapping("/detail/{userid}")
    public JsonData detail(@PathVariable("userid") int userid){
        List<Bill> bills = billService.detail(userid);
        return JsonData.buildSuccess(bills);
    }
}
