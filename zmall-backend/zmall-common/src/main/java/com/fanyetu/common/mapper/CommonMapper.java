package com.fanyetu.common.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author zhanghaonan
 * @date 2019/1/21
 */
public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
