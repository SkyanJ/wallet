package com.example.interceptors;

import com.example.utils.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class JWTInterceptor implements HandlerInterceptor {

    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String token = request.getHeader("token");


        int userId;

        try {
            userId = JWTUtils.getToken(token);

            threadLocal.set(userId);

            return true;
        } catch (Exception e) {
            log.info("token不合法，验证失败");
        }

        return false;

    }
}
