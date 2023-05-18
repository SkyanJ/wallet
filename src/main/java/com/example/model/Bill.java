package com.example.model;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @TableName bill
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("bill")
public class Bill {

    /**
     *  主键
     */
    @TableId(type = IdType.AUTO)
    private Integer billId;


    /**
     *  用户id
     */
    private Integer userId;

    /**
     *  明细支出/收入
     */
    private BigDecimal detail;

    /**
     *  时间戳
     */
    private Date time;

    public Bill(Integer userId, BigDecimal detail, Date time) {
        this.userId = userId;
        this.detail = detail;
        this.time = time;
    }
}