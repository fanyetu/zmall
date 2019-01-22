package com.fanyetu.common.exception;

/**
 * 通用异常
 *
 * @author zhanghaonan
 * @date 2019/1/22
 */
public class ZmallException extends RuntimeException {

    public ZmallException() {
    }

    public ZmallException(String message) {
        super(message);
    }

    public ZmallException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZmallException(Throwable cause) {
        super(cause);
    }

    public ZmallException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
