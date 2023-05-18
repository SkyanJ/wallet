package com.example.service.impl;

import com.example.mapper.BillMapper;
import com.example.mapper.WalletMapper;
import com.example.model.Bill;
import com.example.model.Wallet;
import com.example.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;

/**
* @author mi
* @description 针对表【wallet】的数据库操作Service实现
* @createDate 2023-05-18 17:46:42
*/
@Transactional
@Service
public class WalletServiceImpl implements WalletService{

    @Autowired
    private WalletMapper walletMapper;

    @Autowired
    private BillMapper billMapper;

    /**
     * 查询用户余额
     * @param userid
     * @return
     */
    @Override
    public Wallet check(int userid) {
        Wallet wallet = walletMapper.selectById(userid);
        return wallet;
    }

    /**
     * 消费100元
     * @param userid
     */
    @Override
    public void consume(int userid) {
        walletMapper.consume(userid);
        Bill bill = new Bill(userid,new BigDecimal(-100),new Date());
        billMapper.insert(bill);
    }


    /**
     * 退款20元
     * @param userid
     */
    @Override
    public void refund(int userid) {
        walletMapper.refund(userid);
        Bill bill = new Bill(userid,new BigDecimal(+20),new Date());
        billMapper.insert(bill);
    }
}




