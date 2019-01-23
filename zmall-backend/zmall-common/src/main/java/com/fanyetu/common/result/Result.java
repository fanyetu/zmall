package com.fanyetu.common.result;

import lombok.*;

/**
 * @author zhanghaonan
 * @date 2019/1/22
 */
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private int code;

    private String msg;

    private Object data;
}
