package com.fanyetu.common.result;

/**
 * @author zhanghaonan
 * @date 2019/1/22
 */
public class ResultGenerator {

    /**
     * 成功
     * @param data
     * @return
     */
    public static Result genSuccess(Object data){
        return Result.builder()
                .code(ResultCode.SUCCESS.getCode())
                .msg(ResultCode.SUCCESS.getMsg())
                .data(data)
                .build();
    }
}
