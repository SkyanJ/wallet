package com.example.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@TableName("wallet")
@Data
public class Wallet {

    /**
     *  用户id
     */
    @TableId
    private Integer userId;

    /**
     *  用户钱余额
     */
    private BigDecimal balance;


}
