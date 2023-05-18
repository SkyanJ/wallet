package com.example.service;

import com.example.model.Bill;

import java.util.List;

/**
* @author mi
* @description 针对表【bill】的数据库操作Service
* @createDate 2023-05-18 18:00:47
*/
public interface BillService {

    /**
     * 查询金额明细
     * @param userid
     * @return
     */
    List<Bill> detail(int userid);
}
