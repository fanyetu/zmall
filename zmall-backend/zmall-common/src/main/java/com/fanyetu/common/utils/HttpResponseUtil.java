package com.fanyetu.common.utils;


import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author zhanghaonan
 * @date 2019/1/27
 */
public class HttpResponseUtil {

    public static void writeSuccessJson(HttpServletResponse response, String result) throws IOException {
        response.setStatus(HttpStatus.OK.value());
        writeJson(response, result);
    }

    public static void writeUnauthorizedJson(HttpServletResponse response, String result) throws IOException {
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        writeJson(response, result);
    }

    public static void writeJson(HttpServletResponse response, String result) throws IOException {
        response.setContentType("application/json;chartset=utf-8");
        PrintWriter out = response.getWriter();
        out.write(result);
        out.flush();
        out.close();
    }
}
