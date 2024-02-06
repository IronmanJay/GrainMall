package com.ironmanjay.grainmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ironmanjay.grainmall.common.utils.PageUtils;
import com.ironmanjay.grainmall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author IronmanJay
 * @email 1975686676@qq.com
 * @date 2024-02-04 23:23:08
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

