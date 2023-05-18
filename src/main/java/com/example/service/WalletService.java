package com.example.service;

import com.example.model.Wallet;

/**
* @author mi
* @description 针对表【wallet】的数据库操作Service
* @createDate 2023-05-18 17:46:42
*/
public interface WalletService {

    Wallet check(int userid);

    void consume(int userid);

    void refund(int userid);
}
