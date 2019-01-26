package com.fanyetu.zmallmanager.auth.custom;

import com.fanyetu.common.result.Result;
import com.fanyetu.common.result.ResultCode;
import com.fanyetu.common.result.ResultGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhanghaonan
 * @date 2019/1/26
 */
@Component
public class CustomAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
                       AccessDeniedException accessDeniedException) throws IOException, ServletException {
        Result result = ResultGenerator.genResult(ResultCode.FORBIDDEN, "权限不足，请联系管理员");
        response.setStatus(HttpStatus.FORBIDDEN.value());
//        HttpResponseUtil.writeJson(response, JacksonUtil.objectToJSON(result));
    }
}
