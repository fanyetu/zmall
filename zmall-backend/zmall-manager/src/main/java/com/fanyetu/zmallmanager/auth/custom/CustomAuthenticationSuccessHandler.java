package com.fanyetu.zmallmanager.auth.custom;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhanghaonan
 * @date 2019/1/26
 */
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {

        /*User currentUser = SecurityContextUtil.getCurrentUser();
        if (currentUser != null) {
            currentUser.setPassword(null);
        }
        Result result = ResultGenerator.genSuccessResult("登录成功", currentUser);
        HttpResponseUtil.writeSuccessJson(response, JacksonUtil.objectToJSON(result));*/
    }
}
