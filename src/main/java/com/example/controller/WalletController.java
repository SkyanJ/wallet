package com.example.controller;

import com.example.model.Wallet;
import com.example.service.WalletService;
import com.example.utils.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/api/wallet")
public class WalletController {

    @Autowired
    private WalletService walletService;

    /**
     * 查询用户余额
     *
     * @param userid
     * @return
     */
    @GetMapping("/check/{userid}")
    public JsonData check(@PathVariable("userid") int userid) {

        Wallet wallet = walletService.check(userid);
        return JsonData.buildSuccess(wallet);
    }

    /**
     * 固定消费100的接口
     * @param userid
     * @return
     */
    @GetMapping("/consume/{userid}")
    public JsonData consume(@PathVariable("userid") int userid){
        walletService.consume(userid);
        return JsonData.buildSuccess();
    }

    /**
     * 固定退款20的接口
     * @param userid
     * @return
     */
    @GetMapping("/refund/{userid}")
    public JsonData refund(@PathVariable("userid") int userid){
        walletService.refund(userid);
        return JsonData.buildSuccess();
    }
}
