package com.fanyetu.zmallgoods.controller;

import com.fanyetu.common.result.Result;
import com.fanyetu.common.result.ResultGenerator;
import com.fanyetu.zmallgoods.service.GoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghaonan
 * @date 2019/1/22
 */
@RestController
@RequestMapping("/goods/category")
public class GoodsCategoryController {


    @Autowired
    private GoodsCategoryService goodsCategoryService;

    @GetMapping("/all")
    public Result getGoodCategories(){
        return ResultGenerator.genSuccess(goodsCategoryService.getAllGoodsCategories());
    }

}
