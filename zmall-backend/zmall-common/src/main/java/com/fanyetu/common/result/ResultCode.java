package com.fanyetu.common.result;

/**
 * @author zhanghaonan
 * @date 2019/1/22
 */
public enum ResultCode {
    SUCCESS(1, "成功");

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
