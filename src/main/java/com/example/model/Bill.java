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
     *
     */
    @TableId(type = IdType.AUTO)
    private Integer billId;


    /**
     *
     */
    private Integer userId;

    /**
     *
     */
    private BigDecimal detail;

    /**
     *
     */
    private Date time;

    public Bill(Integer userId, BigDecimal detail, Date time) {
        this.userId = userId;
        this.detail = detail;
        this.time = time;
    }
}