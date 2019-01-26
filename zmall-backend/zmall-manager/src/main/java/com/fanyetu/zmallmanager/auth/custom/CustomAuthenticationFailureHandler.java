package com.fanyetu.zmallmanager.auth.custom;

import com.fanyetu.common.result.Result;
import com.fanyetu.common.result.ResultGenerator;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhanghaonan
 * @date 2019/1/26
 */
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                        AuthenticationException e) throws IOException, ServletException {
        Result result;
        if (e instanceof BadCredentialsException ||
                e instanceof UsernameNotFoundException) {
            result = ResultGenerator.getUnauthorizedResult("账户名或者密码输入错误!");
        } else if (e instanceof LockedException) {
            result = ResultGenerator.getUnauthorizedResult("账户被锁定，请联系管理员!");
        } else if (e instanceof CredentialsExpiredException) {
            result = ResultGenerator.getUnauthorizedResult("密码过期，请联系管理员!");
        } else if (e instanceof AccountExpiredException) {
            result = ResultGenerator.getUnauthorizedResult("账户过期，请联系管理员!");
        } else if (e instanceof DisabledException) {
            result = ResultGenerator.getUnauthorizedResult("账户被禁用，请联系管理员!");
        } else {
            result = ResultGenerator.getUnauthorizedResult("登录失败!");
        }

//        HttpResponseUtil.writeUnauthorizedJson(response, JacksonUtil.objectToJSON(result));
    }
}
