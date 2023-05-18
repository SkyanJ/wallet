package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mapper.BillMapper;
import com.example.model.Bill;
import com.example.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* @author mi
* @description 针对表【bill】的数据库操作Service实现
* @createDate 2023-05-18 18:00:47
*/
@Transactional
@Service
public class BillServiceImpl implements BillService{

    @Autowired
    private BillMapper billMapper;

    /**
     * 查询金额明细
     * @param userid
     * @return
     */
    @Override
    public List<Bill> detail(int userid) {

        List<Bill> bills = billMapper.selectList(null);

        return bills;
    }
}




