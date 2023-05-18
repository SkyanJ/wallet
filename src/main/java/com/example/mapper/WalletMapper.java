package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.Wallet;
import org.apache.ibatis.annotations.Param;

public interface WalletMapper extends BaseMapper<Wallet> {

    void consume(@Param("userid") int userid);

    void refund(@Param("userid") int userid);
}
