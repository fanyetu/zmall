package com.fanyetu.zmallmanager.goods.service;

import com.fanyetu.common.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhanghaonan
 * @date 2019/1/23
 */
@FeignClient(value = "zmall-goods")
@RequestMapping("/goods/category")
public interface GoodsCategoryService {

    @GetMapping("/all")
    Result getGoodCategories();
}
