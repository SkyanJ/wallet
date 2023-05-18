package com.example.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;


public class JWTUtils {

    private static String TOKEN = "token!Q@W3e4r";

    /**
     * 验证token并返回token中payload中的用户id
     * @param token
     * @return
     */
    public static int getToken(String token){
        return JWT.require(Algorithm.HMAC256(TOKEN)).build().verify(token).getClaim("id").asInt();
    }
}
