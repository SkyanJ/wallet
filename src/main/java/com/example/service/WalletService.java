package com.example.service;

import com.example.model.Wallet;

/**
* @author mi
* @description 针对表【wallet】的数据库操作Service
* @createDate 2023-05-18 17:46:42
*/
public interface WalletService {

    /**
     * 查询用户余额
     * @param userid
     * @return
     */
    Wallet check(int userid);

    /**
     * 消费100元
     * @param userid
     */
    void consume(int userid);

    /**
     * 退款20元
     * @param userid
     */
    void refund(int userid);
}
