package com.ironmanjay.grainmall.product.dao;

import com.ironmanjay.grainmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author IronmanJay
 * @email 1975686676@qq.com
 * @date 2024-02-04 23:23:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
