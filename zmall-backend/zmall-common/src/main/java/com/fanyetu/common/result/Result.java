package com.fanyetu.common.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhanghaonan
 * @date 2019/1/22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private int code;

    private String msg;

    private Object data;
}
