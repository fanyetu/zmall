package com.fanyetu.zmallgoods.service.impl;

import com.fanyetu.zmallgoods.mapper.GoodsCategoryMapper;
import com.fanyetu.zmallgoods.model.GoodsCategory;
import com.fanyetu.zmallgoods.service.GoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhanghaonan
 * @date 2019/1/22
 */
@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService {

    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;

    @Override
    public List<GoodsCategory> getAllGoodsCategories(){
        List<GoodsCategory> goodsCategories = goodsCategoryMapper.selectAll();
        return goodsCategories;
    }
}
